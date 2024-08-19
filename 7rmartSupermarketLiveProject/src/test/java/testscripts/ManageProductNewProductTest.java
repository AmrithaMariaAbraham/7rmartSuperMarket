package testscripts;
import org.testng.annotations.Test;
import pages.Login;
import pages.ManageProductNewProductCreate;
import utilities.PageUtility;

public class ManageProductNewProductTest extends Base
{
  @Test
  public void manageProduct()
  {
	  Login login=new Login(driver);
	  login.enterValidUsername("admin");
	  login.enterValidPassword("admin");
	  login.clickLoginbutton();
	  ManageProductNewProductCreate mangNew=new ManageProductNewProductCreate(driver);
	  mangNew.clickManageProduct();
	  mangNew.clickNew();
	  String title="Milk";
	  mangNew.enterTitleValue(title);
	  mangNew.selectProductType();
	  mangNew.enterValueforTagField(title);
	  mangNew.selectCategoryFromDropDown();
	  mangNew.selectSubCategoryFromDropDown();
	  mangNew.selectGroupIDfromDropDown();
	  mangNew.selectPriceType();
	  mangNew.selectMinimumPrice();
	  String qty="100";
	  mangNew.enterMaximumQuantity(qty);
	  String price="45";
	  mangNew.enterPriceforProduct(price);
	  String mrp="60";
	  mangNew.enterMRPforProduct(mrp);
	  String stock="150";
	  mangNew.stockAvailablityforProduct(stock);
	  String purchasePower="50";
	  mangNew.enterPurchasePriceforProduct(purchasePower);
	  String description="Milk is White in color";
	  mangNew.enterDescription(description);
	  PageUtility page=new PageUtility();
	  page.scrollDownX893Y61();
	  mangNew.clickSaveButtonforCreatingNewProduct();
	  }
}
