package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;
import pages.ManageProductNewProductCreate;

public class ManageProductNewProductTest extends Base
{
  @Test
  public void manageProduct() throws IOException
  {
	  Login login=new Login(driver);
	  login.enterValidUsername();
	  login.enterValidPassword();
	  login.clickLoginbutton();
	  ManageProductNewProductCreate mangNew=new ManageProductNewProductCreate(driver);
	  mangNew.clickManageProduct();
	  mangNew.clickNew();
	  mangNew.enterTitleValue();
	  mangNew.selectProductType();
	  mangNew.selectCategoryFromDropDown();
	  mangNew.selectSubCategoryFromDropDown();
	  mangNew.selectPriceType();
	  mangNew.selectMinimumPiece();
	  mangNew.enterMaximumQuantity();
	  mangNew.enterPriceforProduct();
	  mangNew.stockAvailablityforProduct();
	  mangNew.clickSaveButtonforCreatingNewProduct();
	  boolean isAlertDisplayed= mangNew.isalertdisplayed();
	  assertTrue(isAlertDisplayed,Constants.ERRORFORMANAGEPRODUCTNEWPRODUCT);
	  }
}
