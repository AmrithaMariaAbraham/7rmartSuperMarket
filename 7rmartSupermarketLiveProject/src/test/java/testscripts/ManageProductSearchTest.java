package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.ManageProductDelete;
import pages.ManageProductSearch;
import utilities.ExcelUtility;

public class ManageProductSearchTest extends Base
{
	public ManageProductSearch manageProductSearch;
	public ManageProductDelete manageProductDelete;
	
  @Test
  public void manageProductSerach() throws IOException 
  {
	  /*String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();
	  ManageProductSearch mangSearch=new ManageProductSearch(driver);	  
	  mangSearch.clickManageProduct();
	  mangSearch.clickSearchButton();
	  mangSearch.enterTitle(title);
	  mangSearch.enterProductCode(productCode);
	  mangSearch.selectCategoryfromDropdown();
	  mangSearch.selectSubCategoryfromDropDown();
	  mangSearch.clickSearch();*/
	  String title=ExcelUtility.getStringData(1,0,"ManageProductSearch");
	  String productCode=ExcelUtility.getStringData(1,1,"ManageProductSearch");
	  manageProductDelete=manageProductSearch.clickManageProduct().clickSearchButton().enterTitle(title).enterProductCode(productCode).selectCategoryfromDropdown().selectSubCategoryfromDropDown().clickSearch();
	  boolean isAlertDisplayed=manageProductSearch.issearchAlertDisplayed();
	  assertTrue(isAlertDisplayed,Constants.ERRORFORMANAGEPRODUCTSEARCH);
	  }
}
