package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.AdminUserSearch;
import pages.ManageCategoryNew;
import utilities.ExcelUtility;

public class AdminUserSearchTest extends Base
{
	public AdminUserSearch adminUserSearch;
	public ManageCategoryNew manageCategoryNew;
	
  @Test
  public void adminusersearch() throws IOException 
  {
	  /*String usernamefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();*/
	  String username=ExcelUtility.getStringData(1,0,"AdminUsers");
	  manageCategoryNew=adminUserSearch.clickAdminUsers().clickSearch().enterUsername(username).selectUserTypeFromDropdown().selectSearchButton().deleteSearchedValue();
	   /*admin.deleteSearchedValue();*/
	  boolean isalertdisplayed=adminUserSearch.isSearchAlertDisplayed();
	  assertTrue(isalertdisplayed,Constants.ERRORFORADMINUSERSEARCH);
  }
}
