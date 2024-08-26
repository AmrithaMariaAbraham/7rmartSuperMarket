package testscripts;

import static org.testng.Assert.assertTrue;
import java.awt.AWTException;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;
import pages.ManageFooter;
import utilities.ExcelUtility;

public class ManageFooterTest extends Base 
{
  @Test
  public void manageFooter() throws AWTException, IOException 
  {
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();
	  ManageFooter mangFooter=new ManageFooter(driver);
	  mangFooter.clickManageFooterText();
	  mangFooter.editFooterTextValue();
	  String address=ExcelUtility.getStringData(1,0,"ManageFooter");
	  String EMail=ExcelUtility.getStringData(1,1,"ManageFooter");
	  String Phone=ExcelUtility.getIntegerData(1,2,"ManageFooter");
	  mangFooter.editAddress(address);
	  mangFooter.editEmail(EMail);
	  mangFooter.editPhoneNumber(Phone);
	  mangFooter.clickUpdateButton();
	  boolean isSuccessfullmesgdisplayed=mangFooter.isFooterDisplayedSuccessfullydisplayed();
	  assertTrue(isSuccessfullmesgdisplayed,Constants.EERORFORMANAGEFOOTER);
  }
}
