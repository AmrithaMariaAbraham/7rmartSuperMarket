package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;
import pages.ManageProductNewProductCreate;
import utilities.ExcelUtility;

public class ManageProductNewProductTest extends Base
{
  @Test
  public void manageProduct() throws IOException
  {
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();
	  ManageProductNewProductCreate mangNew=new ManageProductNewProductCreate(driver);
	  mangNew.clickManageProduct();
	  mangNew.clickNew();
	  String title=ExcelUtility.getStringData(1,1,"ManageProductNew");
	  mangNew.enterTitleValue(title);
	  mangNew.selectProductType();
	  mangNew.selectCategoryFromDropDown();
	  mangNew.selectSubCategoryFromDropDown();
	  mangNew.selectPriceType();
	  mangNew.selectMinimumPiece();
	  String qty=ExcelUtility.getIntegerData(1,2,"ManageProductNew");
	  mangNew.enterMaximumQuantity(qty);
	  String Price=ExcelUtility.getIntegerData(1,3,"ManageProductNew");
	  mangNew.enterPriceforProduct(Price);
	  String Stock=ExcelUtility.getIntegerData(1,4,"ManageProductNew");
	  mangNew.stockAvailablityforProduct(Stock);
	  mangNew.clickSaveButtonforCreatingNewProduct();
	  boolean isAlertDisplayed= mangNew.isalertdisplayed();
	  assertTrue(isAlertDisplayed,Constants.ERRORFORMANAGEPRODUCTNEWPRODUCT);
	  }
}
