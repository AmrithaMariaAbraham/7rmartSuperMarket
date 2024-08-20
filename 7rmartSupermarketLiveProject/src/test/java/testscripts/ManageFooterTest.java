package testscripts;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.Login;
import pages.ManageFooter;
import utilities.FileUploadUtility;

public class ManageFooterTest extends Base {
  @Test
  public void manageFooter() throws AWTException 
  {
	  FileUploadUtility fileUpload=new FileUploadUtility();
	  Login login=new Login(driver);
	  login.enterValidUsername("admin");
	  login.enterValidPassword("admin");
	  login.clickLoginbutton();
	  ManageFooter mangFooter=new ManageFooter(driver);
	  mangFooter.clickManageFooterText();
	  mangFooter.editFooterTextValue();
	  String address="Asiatic business center,Technopark Phase three,Trivandrum";  
	  mangFooter.editAddress(address);
	  String email="automationtesting@gmail.com";
	  mangFooter.editEmail(email);
	  String phone="9876543210";
	  mangFooter.editPhoneNumber(phone);
	  mangFooter.clickUpdateButton();
	  boolean isSuccessfullmesgdisplayed=mangFooter.isFooterDisplayedSuccessfullydisplayed();
	  assertTrue(isSuccessfullmesgdisplayed,Constants.EERORFORMANAGEFOOTER);
  }
}
