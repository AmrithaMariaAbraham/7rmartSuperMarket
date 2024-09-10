package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.ManageNewsNew;
import pages.ManageProductNewProductCreate;
import utilities.ExcelUtility;

public class ManageNewsTestNew extends Base
{
	public ManageNewsNew manageNewsnew;
	public ManageProductNewProductCreate manageProductNewproduct;
	
  @Test
  public void manageNews() throws IOException 
  {
	  /*String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();	
	  ManageNewsNew mangNews=new ManageNewsNew(driver);
	  mangNews.clickManageNews();
	  mangNews.clickNewButton();*/
	  String News=ExcelUtility.getStringData(1,0,"ManageNewsNew");
	  manageProductNewproduct=manageNewsnew.clickManageNews().clickNewButton().enterValueforNews(News).clickSaveButton();
	  /*mangNews.enterValueforNews(News);
	  mangNews.clickSaveButton();*/
	  boolean isSuccessAlertdisplayed= manageNewsnew.isAlertdisplayed();
	  assertTrue(isSuccessAlertdisplayed,Constants.ERRORFORMANAGENEWSNEW);
  }
}
