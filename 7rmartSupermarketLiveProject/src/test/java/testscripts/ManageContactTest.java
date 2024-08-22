package testscripts;

import static org.testng.Assert.assertTrue;
import java.awt.AWTException;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;
import pages.ManageContact;

public class ManageContactTest extends Base
{
  @Test
  public void manageContactTest() throws AWTException, InterruptedException, IOException 
  {  
	  Login login=new Login(driver);
	  login.enterValidUsername();
	  login.enterValidPassword();
	  login.clickLoginbutton();	
	  ManageContact mangCont=new ManageContact(driver);
	  mangCont.clickManageContact();
	  mangCont.clickEditButton();	  
	  mangCont.enterPhonenumber();
	  mangCont.editEmail();
	  mangCont.editAddress();  
	  mangCont.editdeliverytime();
	  mangCont.editDeliveryChargeLimit();
	  mangCont.clickUpdateButton();
	  boolean isSuccessfullAlertdisplayed=mangCont.isAlertDisplayed();
	  assertTrue(isSuccessfullAlertdisplayed,Constants.ERRORFORMANAGECONTACT);	  
  }
}
