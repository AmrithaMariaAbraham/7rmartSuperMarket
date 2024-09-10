package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;
import pages.ManageProductDelete;
import utilities.ExcelUtility;

public class ManageProductDeleteTest extends Base 
{
	public ManageProductDelete manageProductDelete;
	
  @Test(priority=1)
  public void manageProductDelete() throws IOException 
  {
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
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
  public void manageProddelSearch() throws IOException 
  {
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();
	  ManageProductDelete mangProdDel=new ManageProductDelete(driver);
	  mangProdDel.clickmanageProduct();
	  mangProdDel.clickSearchButton();
	  String TitLe=ExcelUtility.getStringData(1,0,"ManageProductSearch");
	  String productcode=ExcelUtility.getStringData(1,1,"ManageProductSearch");
	  mangProdDel.SearchdeletedProduct(TitLe,productcode);
	  mangProdDel.search();	 
	  boolean isElementFound=mangProdDel.iselementdisplayed();
	  assertTrue(isElementFound,Constants.ERRORFORMANAGEDELETESEARCH);
   }  
}
