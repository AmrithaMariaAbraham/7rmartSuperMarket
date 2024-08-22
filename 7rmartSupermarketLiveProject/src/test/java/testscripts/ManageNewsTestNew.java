package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;
import pages.ManageNewsNew;

public class ManageNewsTestNew extends Base
{
  @Test
  public void manageNews() throws IOException 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername();
	  login.enterValidPassword();
	  login.clickLoginbutton();	
	  ManageNewsNew mangNews=new ManageNewsNew(driver);
	  mangNews.clickManageNews();
	  mangNews.clickNewButton();
	  mangNews.enterValueforNews();
	  mangNews.clickSaveButton();
	  boolean isSuccessAlertdisplayed= mangNews.isAlertdisplayed();
	  assertTrue(isSuccessAlertdisplayed,Constants.ERRORFORMANAGENEWSNEW);
  }
}
