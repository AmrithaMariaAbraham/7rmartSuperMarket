package testscripts;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import pages.Login;
import pages.ManageContact;

public class ManageContactTest extends Base
{
  @Test
  public void manageContactTest() 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername("admin");
	  login.enterValidPassword("admin");
	  login.clickLoginbutton();
	  ManageContact mangCont=new ManageContact(driver);
	  mangCont.clickManageContent();
	  mangCont.clickManageContact();
	 /* mangCont.clickEditButton();
	  String email="def@gmail.com";
	  mangCont.editEmail(email);
	  String time="50";
	  mangCont.editdeliverytime(time);
	  String deliveryChargeLimit="115";
	  mangCont.editDeliveryChargeLimit(deliveryChargeLimit);
	  boolean isSuccessfullAlertdisplayed=mangCont.isAlertDisplayed();
	  assertTrue(isSuccessfullAlertdisplayed, "Successful message not found");
	  */
  }
}
