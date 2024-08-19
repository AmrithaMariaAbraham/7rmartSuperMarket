package testscripts;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pages.Login;
import pages.ManageCategoryNew;

public class ManageCategoryNewTest extends Base 
{
  @Test
  public void manageCategorySearch() 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername("admin");
	  login.enterValidPassword("admin");
	  login.clickLoginbutton();
	  ManageCategoryNew mangAdd=new ManageCategoryNew(driver);
	  mangAdd.clickManageCategory();
	  mangAdd.clickAddButton();
	  String categoryValue="Discount";
	  mangAdd.enterCategoryValue(categoryValue);
	  mangAdd.selectAValuefromSelectGroup();
	 //mangAdd.uploadDiscountImage();
	  mangAdd.clickSaveButton();	 
	  boolean isAlertLoaded=mangAdd.isAlertdisplayed();
	  assertTrue(isAlertLoaded, "Alert not loaded");
  }
}
