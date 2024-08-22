package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;
import pages.ManageProductDelete;

public class ManageProductDeleteTest extends Base 
{
  @Test(priority=1)
  public void manageProductDelete() throws IOException 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername();
	  login.enterValidPassword();
	  login.clickLoginbutton();
	  ManageProductDelete mangProdDel=new ManageProductDelete(driver);
	  mangProdDel.clickmanageProduct();
	  mangProdDel.deleteProduct();
	  boolean isAlertdisplayed=mangProdDel.isTitledisplayed();
	  assertTrue(isAlertdisplayed,Constants.ERRORFORMANAGEDELETE);
  }
  @Test(priority=2)
  public void manageProddelSearch() throws IOException 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername();
	  login.enterValidPassword();
	  login.clickLoginbutton();
	  ManageProductDelete mangProdDel=new ManageProductDelete(driver);
	  mangProdDel.clickmanageProduct();
	  mangProdDel.clickSearchButton();
	  mangProdDel.SearchdeletedProduct();
	  mangProdDel.search();	 
	  boolean isElementFound=mangProdDel.iselementdisplayed();
	  assertTrue(isElementFound,Constants.ERRORFORMANAGEDELETESEARCH);
   }  
}
