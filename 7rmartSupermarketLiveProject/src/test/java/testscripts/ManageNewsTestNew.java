package testscripts;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import constants.Constants;
import pages.Login;
import pages.ManageNewsNew;

public class ManageNewsTestNew extends Base
{
  @Test
  public void manageNews() 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername("admin");
	  login.enterValidPassword("admin");
	  login.clickLoginbutton();
	  ManageNewsNew mangNews=new ManageNewsNew(driver);
	  mangNews.clickManageNews();
	  mangNews.clickNewButton();
	  String news="Automation Today";
	  mangNews.enterValueforNews(news);
	  mangNews.clickSaveButton();
	  boolean isSuccessAlertdisplayed= mangNews.isAlertdisplayed();
	  assertTrue(isSuccessAlertdisplayed,Constants.ERRORFORMANAGENEWSNEW);
  }
}
