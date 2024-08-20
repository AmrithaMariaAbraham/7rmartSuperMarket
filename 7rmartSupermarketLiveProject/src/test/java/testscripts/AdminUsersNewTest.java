package testscripts;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUsersNew;
import pages.Login;

public class AdminUsersNewTest extends Base
{
  @Test
  public void adminUsers() throws InterruptedException 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername("admin");
	  login.enterValidPassword("admin");
	  login.clickLoginbutton();
	  AdminUsersNew admin=new AdminUsersNew(driver);
	  admin.clickAdminUsers();
	  admin.clickNew();
	  String username="Obsqura1";
	  admin.enterUsername(username);
	  String password="214355";
	  admin.enterPassword(password);
	  admin.selectUserTypeFromDropdown();
	  admin.clickSaveButton();
	  boolean isAlertdisplayed=admin.isAlertDisplayed();
	  assertTrue(isAlertdisplayed,Constants.ERRORFORADMINUSERNEWUSER);
  }
}
