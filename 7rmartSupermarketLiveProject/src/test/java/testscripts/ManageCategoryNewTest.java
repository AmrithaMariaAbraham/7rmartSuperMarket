package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.AdminUsers;
import pages.HomePage;
import pages.Login;
import pages.ManageCategoryNew;
import pages.ManageContact;
import utilities.ExcelUtility;

public class ManageCategoryNewTest extends Base 
{
	public Login login;
	public AdminUsers adminUsers;
	public ManageCategoryNew manageCategoryNew;
	public ManageContact manageContact;
	public HomePage homePage;
  @Test
  public void manageCategorySearch() throws IOException, InterruptedException 
  {
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  String username=ExcelUtility.getStringData(1,0,"AdminUsers");
	  String Password=ExcelUtility.getStringData(1,1,"AdminUsers");
	  String CateValue=ExcelUtility.getStringData(1,0,"ManageCategoryNew");
	  login=new Login(driver);
	  adminUsers=login.enterValidUsername(useramefield).enterValidPassword(passwordfield).clickLoginbutton().clickAdminUsers().clickNew().enterUsername(username).enterPassword(Password).selectUserTypeFromDropdown().clickSaveButton().selectSearchButton();
	  manageCategoryNew=adminUsers.deleteSearchedValue();
	  manageContact=manageCategoryNew.hompageclick().clickCategory().clickAddButton().enterCategoryValue(CateValue).selectAValuefromSelectGroup().clickSaveButton();
	  boolean isAlertLoaded=manageCategoryNew.isAlertdisplayed();
	  assertTrue(isAlertLoaded,Constants.ERRORFORMANAGECATEGORYALERT);
  }
}
