package testscripts;

import static org.testng.Assert.assertTrue;
import java.awt.AWTException;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.ManageContact;
import pages.ManageFooter;
import utilities.ExcelUtility;

public class ManageContactTest extends Base
{
	public ManageContact manageContact;
	public ManageFooter manageFooter;
	
  @Test
  public void manageContactTest() throws IOException, AWTException, InterruptedException  
  {  
	 /* String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();	
	  ManageContact mangCont=new ManageContact(driver);
	  mangCont.clickManageContact();
	  mangCont.clickEditButton();*/
	  String phone=ExcelUtility.getIntegerData(1,0,"ManageContact");
	  String email=ExcelUtility.getStringData(1,1,"ManageContact");
	  String address=ExcelUtility.getStringData(1,2,"ManageContact");
	  String time=ExcelUtility.getIntegerData(1,3,"ManageContact");
	  String deliveryCharge=ExcelUtility.getIntegerData(1,4,"ManageContact");
	  /*mangCont.enterPhonenumber(phone);
	  mangCont.editEmail(email);	  
	  mangCont.editAddress(address);  
	  mangCont.editdeliverytime(time);
	  mangCont.editDeliveryChargeLimit(deliveryCharge);
	  mangCont.clickUpdateButton();*/
	  manageFooter=manageContact.clickManageContact().clickEditButton().enterPhonenumber(phone).editEmail(email).editAddress(address).editdeliverytime(time).editDeliveryChargeLimit(deliveryCharge).clickUpdateButton();
	  boolean isSuccessfullAlertdisplayed=manageContact.isAlertDisplayed();
	  assertTrue(isSuccessfullAlertdisplayed,Constants.ERRORFORMANAGECONTACT);	  
  }
}
