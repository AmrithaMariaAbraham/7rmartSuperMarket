package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.AdminUsersNew;
import pages.Login;

public class AdminUsersNewTest extends Base
{
  @Test
  public void adminUsers() throws InterruptedException, IOException 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername();
	  login.enterValidPassword();
	  login.clickLoginbutton();	  
	  AdminUsersNew admin=new AdminUsersNew(driver);
	  admin.clickAdminUsers();
	  admin.clickNew();
	  admin.enterUsername();
	  admin.enterPassword();
	  admin.selectUserTypeFromDropdown();
	  admin.clickSaveButton();
	  boolean isAlertdisplayed=admin.isAlertDisplayed();
	  assertTrue(isAlertdisplayed,Constants.ERRORFORADMINUSERNEWUSER);
  }
}
