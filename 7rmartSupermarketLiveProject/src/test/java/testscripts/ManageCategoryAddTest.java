package testscripts;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pages.Login;
import pages.ManageCategoryAdd;

public class ManageCategoryAddTest extends Base {
  @Test
  public void manageCategorySearch() 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername("admin");
	  login.enterValidPassword("admin");
	  login.clickLoginbutton();
	  ManageCategoryAdd mangAdd=new ManageCategoryAdd(driver);
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  mangAdd.clickManageCategory();
	  mangAdd.clickCategory();
	  mangAdd.clickAddButton();
	  String categoryValue="dress";
	  mangAdd.enterCategoryValue(categoryValue);
	  mangAdd.selectAValuefromSelectGroup();
	  mangAdd.clickSaveButton();
	  boolean isAlertLoaded=mangAdd.isAlertdisplayed();
	  assertTrue(isAlertLoaded, "Alert not loaded");
  }
}
