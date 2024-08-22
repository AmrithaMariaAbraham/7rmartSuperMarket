package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.AdminUserSearch;
import pages.Login;

public class AdminUserSearchTest extends Base
{
  @Test(priority=1)
  public void adminusersearch() throws IOException 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername();
	  login.enterValidPassword();
	  login.clickLoginbutton();
	  AdminUserSearch admin=new AdminUserSearch(driver);
	  admin.clickAdminUsers();
	  admin.clickSearch();
	  admin.enterUsername();
	  admin.selectUserTypeFromDropdown();
	  admin.selectSearchButton();
	  boolean isalertdisplayed=admin.isSearchAlertDisplayed();
	  assertTrue(isalertdisplayed,Constants.ERRORFORADMINUSERSEARCH);
  }
  @Test(priority=2)
  public void adminuserdelete() throws IOException 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername();
	  login.enterValidPassword();
	  login.clickLoginbutton();
	  AdminUserSearch admin=new AdminUserSearch(driver);
	  admin.clickAdminUsers();
	  admin.clickSearch();
	  admin.enterUsername();
	  admin.selectUserTypeFromDropdown();
	  admin.selectSearchButton();
	  admin.deleteSearchedValue();
	  boolean isdeletealertdisplayed=admin.isSearchAlertDisplayed();
	  assertTrue(isdeletealertdisplayed,Constants.ERRORFORADMINUSERDELETE);
  }
}
