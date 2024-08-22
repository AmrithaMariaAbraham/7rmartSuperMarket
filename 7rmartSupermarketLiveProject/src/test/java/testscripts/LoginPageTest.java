package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;

public class LoginPageTest extends Base
{
//pass	
  @Test(priority=1)
  public void enterValidUsernameAndPassword() throws IOException 
  	{	  
	  Login login=new Login(driver);	   	  
	  login.enterValidUsername();
	  login.enterValidPassword();
	  login.clickLoginbutton();	  
	  //Assertion
	  boolean isDashboardLoaded=login.isDashboardDisplayed();
	  assertTrue(isDashboardLoaded,Constants.ERRORMESSAGEFORLOGIN);
  	}
  @Test(priority=2)
  public void adminLogout() throws IOException
  	{
	  Login login=new Login(driver);
	  login.enterValidUsername();
	  login.enterValidPassword();
	  login.clickLoginbutton();	  
	  login.adminLogout();
	  boolean loginPageDisplayed=login.isLoginPageDisplayed();
	  assertTrue(loginPageDisplayed,Constants.ERRORMESSAGEFORLOGOUT);
  	}
  @Test(priority=3)
  public void enterValidUsernameandinvalidPasword() throws IOException
   	{
	  Login login=new Login(driver);
	  login.enterValidUsername();
	  login.invalidPassword();
	  login.clickLoginbutton();	
	  boolean invalidPasswordAlert=login.isAlertforInvalidUsernameORPasswordAvailable();
	  assertTrue(invalidPasswordAlert,Constants.ERRORMESSAGEFORINVALIDPASSWORD);
   	}
   @Test(priority=4)
   public void enterInvalidUserNameandValidPassword() throws IOException
   {
		  Login login=new Login(driver);
		  login.invalidUserName();
		  login.enterValidPassword();
		  login.clickLoginbutton();	
		  boolean invalidPasswordAlert=login.isAlertforInvalidUsernameORPasswordAvailable();
		  assertTrue(invalidPasswordAlert,Constants.ERRORMESSAGEFORINVALIDUSERNAME);
   }
   @Test(priority=5)
   public void enteInvalidUserNameandPassword() throws IOException
   {
	      Login login=new Login(driver);
		  login.invalidUserName();
		  login.invalidPassword();
		  login.clickLoginbutton();	
		  boolean invalidPasswordAlert=login.isAlertforInvalidUsernameORPasswordAvailable();
		  assertTrue(invalidPasswordAlert,Constants.ERRORMESSAGEFORINVALIDUSER);
   }
}