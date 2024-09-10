package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.ManageCategoryNew;
import pages.ManageContact;
import utilities.ExcelUtility;

public class ManageCategoryNewTest extends Base 
{
	public ManageCategoryNew manageCategoryNew;
	public ManageContact manageContact;
  @Test
  public void manageCategorySearch() throws IOException, InterruptedException 
  {
	  /*String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();*/  
	  //ManageCategoryNew mangAdd=new ManageCategoryNew(driver);
	  String CateValue=ExcelUtility.getStringData(1,0,"ManageCategoryNew");
	  manageContact= manageCategoryNew.clickCategory().clickAddButton().enterCategoryValue(CateValue).selectAValuefromSelectGroup().uploadDiscountImage().clickSaveButton();
	 /* mangAdd.clickCategory();
	  mangAdd.clickAddButton();
	  mangAdd.enterCategoryValue(CateValue);
	  mangAdd.selectAValuefromSelectGroup();
	  mangAdd.uploadDiscountImage();
	  mangAdd.clickSaveButton();*/	 
	  boolean isAlertLoaded=manageCategoryNew.isAlertdisplayed();
	  assertTrue(isAlertLoaded,Constants.ERRORFORMANAGECATEGORYALERT);
  }
}
