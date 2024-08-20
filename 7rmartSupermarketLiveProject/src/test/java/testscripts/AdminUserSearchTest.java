package testscripts;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserSearch;
import pages.Login;

public class AdminUserSearchTest extends Base
{
  @Test
  public void adminusersearch() 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername("admin");
	  login.enterValidPassword("admin");
	  login.clickLoginbutton();
	  AdminUserSearch admin=new AdminUserSearch(driver);
	  admin.clickAdminUsers();
	  admin.clickSearch();
	  String username="Obsqura1";
	  admin.enterUsername(username);
	  admin.selectUserTypeFromDropdown();
	  admin.selectSearchButton();
	  boolean isalertdisplayed=admin.isAlertDisplayed();
	  assertTrue(isalertdisplayed,Constants.ERRORFORADMINUSERSEARCH);
  }
}
