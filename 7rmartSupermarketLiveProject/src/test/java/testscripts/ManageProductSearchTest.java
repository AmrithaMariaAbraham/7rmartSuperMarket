package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;
import pages.ManageProductSearch;
import utilities.ExcelUtility;

public class ManageProductSearchTest extends Base
{
  @Test
  public void manageProductSerach() throws IOException 
  {
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();
	  ManageProductSearch mangSearch=new ManageProductSearch(driver);
	  mangSearch.clickManageProduct();
	  mangSearch.clickSearchButton();
	  String title=ExcelUtility.getStringData(1,0,"ManageProductSearch");
	  mangSearch.enterTitle(title);
	  String productCode=ExcelUtility.getStringData(1,1,"ManageProductSearch");
	  mangSearch.enterProductCode(productCode);
	  mangSearch.selectCategoryfromDropdown();
	  mangSearch.selectSubCategoryfromDropDown();
	  mangSearch.clickSearch();
	  boolean isAlertDisplayed=mangSearch.issearchAlertDisplayed();
	  assertTrue(isAlertDisplayed,Constants.ERRORFORMANAGEPRODUCTSEARCH);
	  }
}
