package testscripts;

import static org.testng.Assert.assertTrue;
import java.awt.AWTException;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;
import pages.ManageFooter;

public class ManageFooterTest extends Base 
{
  @Test
  public void manageFooter() throws AWTException, IOException 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername();
	  login.enterValidPassword();
	  login.clickLoginbutton();
	  ManageFooter mangFooter=new ManageFooter(driver);
	  mangFooter.clickManageFooterText();
	  mangFooter.editFooterTextValue();
	  mangFooter.editAddress();
	  mangFooter.editEmail();
	  mangFooter.editPhoneNumber();
	  mangFooter.clickUpdateButton();
	  boolean isSuccessfullmesgdisplayed=mangFooter.isFooterDisplayedSuccessfullydisplayed();
	  assertTrue(isSuccessfullmesgdisplayed,Constants.EERORFORMANAGEFOOTER);
  }
}
