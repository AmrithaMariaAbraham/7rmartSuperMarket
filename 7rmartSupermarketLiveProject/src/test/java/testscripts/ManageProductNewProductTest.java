package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.ManageProductNewProductCreate;
import pages.ManageProductSearch;
import utilities.ExcelUtility;

public class ManageProductNewProductTest extends Base
{
	public ManageProductNewProductCreate manageProductNewproduct;
	public ManageProductSearch manageProductSearch;
	
  @Test
  public void manageProduct() throws IOException
  {
	  /*String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();
	  ManageProductNewProductCreate mangNew=new ManageProductNewProductCreate(driver);
	  mangNew.clickManageProduct();
	  mangNew.clickNew();
	  mangNew.enterTitleValue(title);
	  mangNew.selectProductType();	  
	  mangNew.selectCategoryFromDropDown();
	  mangNew.selectSubCategoryFromDropDown();
	  mangNew.selectPriceType();
	  mangNew.selectMinimumPiece();
	  mangNew.stockAvailablityforProduct(Stock);
	  mangNew.clickSaveButtonforCreatingNewProduct();
	  mangNew.enterMaximumQuantity(qty);
	  mangNew.enterPriceforProduct(Price);
	  mangNew.stockAvailablityforProduct(Stock);
	  mangNew.clickSaveButtonforCreatingNewProduct();*/	  
	  String title=ExcelUtility.getStringData(1,1,"ManageProductNew");
	  String qty=ExcelUtility.getIntegerData(1,2,"ManageProductNew");
	  String Price=ExcelUtility.getIntegerData(1,3,"ManageProductNew");
	  String Stock=ExcelUtility.getIntegerData(1,4,"ManageProductNew");
	  manageProductSearch=manageProductNewproduct.clickManageProduct().clickNew().enterTitleValue(title).selectProductType().selectCategoryFromDropDown().selectSubCategoryFromDropDown().selectPriceType().selectMinimumPiece().enterMaximumQuantity(qty).enterPriceforProduct(Price).stockAvailablityforProduct(Stock).uploadMainImgforProduct().clickSaveButtonforCreatingNewProduct();
	  boolean isAlertDisplayed= manageProductNewproduct.isalertdisplayed();
	  assertTrue(isAlertDisplayed,Constants.ERRORFORMANAGEPRODUCTNEWPRODUCT);
	  }
}
