package testscripts;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import pages.Login;
import pages.ManageFooter;

public class ManageFooterTest extends Base {
  @Test
  public void manageFooter() 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername("admin");
	  login.enterValidPassword("admin");
	  login.clickLoginbutton();
	  ManageFooter mangFooter=new ManageFooter(driver);
	  mangFooter.clickManageFooterText();
	  mangFooter.editFooterTextValue();
	  String address="Asiatic business center,Technopark Phase three,Trivandrum";
	  mangFooter.editAdrdess(address);
	  String email="Automation Testing";
	  mangFooter.editEmail(email);
	  mangFooter.clickUpdateButton();
	  boolean isSuccessfullmesgdisplayed=mangFooter.isFooterDisplayedSuccessfullydisplayed();
	  assertTrue(isSuccessfullmesgdisplayed,"Success message displayed");
  }
}
