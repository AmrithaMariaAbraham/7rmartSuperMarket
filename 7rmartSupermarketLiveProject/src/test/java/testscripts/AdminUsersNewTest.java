package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.AdminUsersNew;
import pages.Login;
import utilities.ExcelUtility;

public class AdminUsersNewTest extends Base
{
  @Test
  public void adminUsers() throws InterruptedException, IOException 
  {
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();	  
	  AdminUsersNew admin=new AdminUsersNew(driver);
	  admin.clickAdminUsers();
	  admin.clickNew();
	  String username=ExcelUtility.getStringData(1,0,"AdminUsers");
	  admin.enterUsername(username);
	  String Password=ExcelUtility.getIntegerData(1,1,"AdminUsers");
	  admin.enterPassword(Password);
	  admin.selectUserTypeFromDropdown();
	  admin.clickSaveButton();
	  boolean isAlertdisplayed=admin.isAlertDisplayed();
	  assertTrue(isAlertdisplayed,Constants.ERRORFORADMINUSERNEWUSER);
  }
}
