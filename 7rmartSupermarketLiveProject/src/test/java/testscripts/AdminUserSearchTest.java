package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.AdminUserSearch;
import pages.Login;
import utilities.ExcelUtility;

public class AdminUserSearchTest extends Base
{
  @Test(priority=1)
  public void adminusersearch() throws IOException 
  {
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();
	  AdminUserSearch admin=new AdminUserSearch(driver);
	  admin.clickAdminUsers();
	  admin.clickSearch();
	  String username=ExcelUtility.getStringData(1,0,"AdminUsers");
	  admin.enterUsername(username);
	  admin.selectUserTypeFromDropdown();
	  admin.selectSearchButton();
	  boolean isalertdisplayed=admin.isSearchAlertDisplayed();
	  assertTrue(isalertdisplayed,Constants.ERRORFORADMINUSERSEARCH);
  }
  @Test(priority=2)
  public void adminuserdelete() throws IOException 
  {
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();
	  AdminUserSearch admin=new AdminUserSearch(driver);
	  admin.clickAdminUsers();
	  admin.clickSearch();
	  String username=ExcelUtility.getStringData(1,0,"AdminUsers");
	  admin.enterUsername(username);
	  admin.selectUserTypeFromDropdown();
	  admin.selectSearchButton();
	  admin.deleteSearchedValue();
	  boolean isdeletealertdisplayed=admin.isSearchAlertDisplayed();
	  assertTrue(isdeletealertdisplayed,Constants.ERRORFORADMINUSERDELETE);
  }
}
