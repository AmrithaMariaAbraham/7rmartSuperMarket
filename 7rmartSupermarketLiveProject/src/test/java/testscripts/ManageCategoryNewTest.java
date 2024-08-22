package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;
import pages.ManageCategoryNew;

public class ManageCategoryNewTest extends Base 
{
  @Test
  public void manageCategorySearch() throws IOException, InterruptedException 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername();
	  login.enterValidPassword();
	  login.clickLoginbutton();	  
	  ManageCategoryNew mangAdd=new ManageCategoryNew(driver);
	  mangAdd.clickCategory();
	  mangAdd.clickAddButton();
	  mangAdd.enterCategoryValue();
	  mangAdd.selectAValuefromSelectGroup();
	  mangAdd.uploadDiscountImage();
	  mangAdd.clickSaveButton();	 
	  boolean isAlertLoaded=mangAdd.isAlertdisplayed();
	  assertTrue(isAlertLoaded,Constants.ERRORFORMANAGECATEGORYALERT);
  }
}
