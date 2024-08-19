package testscripts;
import static org.testng.Assert.assertTrue;
import java.awt.AWTException;
import org.testng.annotations.Test;
import pages.Login;
import pages.ManageContact;

public class ManageContactTest extends Base
{
  @Test
  public void manageContactTest() throws AWTException, InterruptedException 
  {  
	  Login login=new Login(driver);
	  login.enterValidUsername("admin");
	  login.enterValidPassword("admin");
	  login.clickLoginbutton();
	  ManageContact mangCont=new ManageContact(driver);
	  mangCont.clickManageContact();
	  mangCont.clickEditButton();
	  String phoneNum="9876543210";
	  mangCont.enterPhonenumber(phoneNum);
	  String eMail="def@gmail.com";
	  mangCont.editEmail(eMail);
	  String address="abc houseDiv 14, Kadavanthra, Panampilly Nagar,Ernakulam";
	  mangCont.editAddress(address);  
	  String time="60";
	  mangCont.editdeliverytime(time);
	  String deliveryChargeLimit="100";
	  mangCont.editDeliveryChargeLimit(deliveryChargeLimit);
	  mangCont.clickUpdateButton();
	  //boolean isSuccessfullAlertdisplayed=mangCont.isAlertDisplayed();
	  //assertTrue(isSuccessfullAlertdisplayed, "Succesfull message not displayed");	  
  }
}
