package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;
import pages.ManageCategoryNew;
import utilities.ExcelUtility;

public class ManageCategoryNewTest extends Base 
{
  @Test
  public void manageCategorySearch() throws IOException, InterruptedException 
  {
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();	  
	  ManageCategoryNew mangAdd=new ManageCategoryNew(driver);
	  mangAdd.clickCategory();
	  mangAdd.clickAddButton();
	  String CateValue=ExcelUtility.getStringData(1,0,"ManageCategoryNew");
	  mangAdd.enterCategoryValue(CateValue);
	  mangAdd.selectAValuefromSelectGroup();
	  mangAdd.uploadDiscountImage();
	  mangAdd.clickSaveButton();	 
	  boolean isAlertLoaded=mangAdd.isAlertdisplayed();
	  assertTrue(isAlertLoaded,Constants.ERRORFORMANAGECATEGORYALERT);
  }
}
