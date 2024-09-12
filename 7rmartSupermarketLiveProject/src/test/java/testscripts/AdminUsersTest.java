package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.AdminUsers;
import pages.Login;
import pages.ManageCategoryNew;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base
{
	public Login login;
	public AdminUsers adminUser;
	public ManageCategoryNew manageCategoryNew;
	
  @Test
  public void adminUsers() throws InterruptedException, IOException 
  {
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  String username=ExcelUtility.getStringData(1,0,"AdminUsers");
	  String Password=ExcelUtility.getStringData(1,1,"AdminUsers");
	  login=new Login(driver);
	  adminUser=login.enterValidUsername(useramefield).enterValidPassword(passwordfield).clickLoginbutton().clickAdminUsers().clickNew().enterUsername(username).enterPassword(Password).selectUserTypeFromDropdown().clickSaveButton().selectSearchButton();
	  manageCategoryNew=adminUser.deleteSearchedValue();
	  boolean isAlertdisplayed=adminUser.isAlertDisplayed();
	  assertTrue(isAlertdisplayed,Constants.ERRORFORADMINUSERNEWUSER);
  }
}
