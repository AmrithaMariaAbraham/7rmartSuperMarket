package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constants.Constants;
import pages.Login;
import pages.ManageProductDelete;

public class ManageProductDeleteTest extends Base 
{
  @Test(priority=1)
  public void manageProductDelete() 
  {
	  Login login=new Login(driver);
	  String useramefield="admin";
	  String passwordfield="admin"; 	  
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();
	  ManageProductDelete mangProdDel=new ManageProductDelete(driver);
	  mangProdDel.clickmanageProduct();
	  mangProdDel.deleteProduct();
	  boolean isAlertdisplayed=mangProdDel.isTitledisplayed();
	  assertTrue(isAlertdisplayed,Constants.ERRORFORMANAGEDELETE);
  }
  @Test(priority=2)
  public void manageProddelSearch() 
  {
	  Login login=new Login(driver);
	  String useramefield="admin";
	  String passwordfield="admin"; 	  
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();
	  ManageProductDelete mangProdDel=new ManageProductDelete(driver);
	  mangProdDel.clickmanageProduct();
	  mangProdDel.clickSearchButton();
	  mangProdDel.SearcheletedProduct("Milk","P992");
	  mangProdDel.search();	 
	  boolean isElementFound=mangProdDel.iselementdisplayed();
	  assertTrue(isElementFound,Constants.ERRORFORMANAGEDELETESEARCH);
   }  
}
