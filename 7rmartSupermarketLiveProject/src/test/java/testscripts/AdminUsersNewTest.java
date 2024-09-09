package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.AdminUserSearch;
import pages.AdminUsersNew;
import pages.Login;
import utilities.ExcelUtility;

public class AdminUsersNewTest extends Base
{
	public Login login;
	public AdminUsersNew adminUser;
	public AdminUserSearch adminUserSearch;
  @Test
  public void adminUsers() throws InterruptedException, IOException 
  {
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  String username=ExcelUtility.getStringData(1,0,"AdminUsers");
	  String Password=ExcelUtility.getIntegerData(1,1,"AdminUsers");
	  login=new Login(driver);
	  adminUser=login.enterValidUsername(useramefield).enterValidPassword(passwordfield).clickLoginbutton();
	  adminUserSearch=adminUser.clickAdminUsers().clickNew().enterUsername(username).enterPassword(Password).selectUserTypeFromDropdown().clickSaveButton();
	  boolean isAlertdisplayed=adminUser.isAlertDisplayed();
	  assertTrue(isAlertdisplayed,Constants.ERRORFORADMINUSERNEWUSER);
  }
}
