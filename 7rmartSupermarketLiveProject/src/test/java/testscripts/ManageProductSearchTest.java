package testscripts;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import pages.Login;
import pages.ManageProductSearch;

public class ManageProductSearchTest extends Base
{
  @Test
  public void manageProductSerach() 
  {
	  Login login=new Login(driver);
	  String useramefield="admin";
	  String passwordfield="admin"; 	  
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();
	  ManageProductSearch mangSearch=new ManageProductSearch(driver);
	  mangSearch.clickManageProduct();
	  mangSearch.clickSearchButton();
	  String title="Curd12";
	  mangSearch.enterTitle(title);
	  String productCode="P1015";
	  mangSearch.enterProductCode(productCode);
	  mangSearch.selectCategoryfromDropdown();
	  mangSearch.selectSubCategoryfromDropDown();
	  mangSearch.clickSearch();
	  //add Assertion
	  boolean isAlertDisplayed=mangSearch.issearchAlertDisplayed();
	  assertTrue(isAlertDisplayed, "Search Found");
	  }
}
