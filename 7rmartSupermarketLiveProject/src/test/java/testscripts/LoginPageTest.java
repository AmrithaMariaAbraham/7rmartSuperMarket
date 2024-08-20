package testscripts;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;
public class LoginPageTest extends Base
{
	
  @Test(priority=1)
  public void enterValidUsernameAndPassword() 
  	{	  
	  Login login=new Login(driver);
	  String useramefield="admin";
	  String passwordfield="admin"; 	  
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();	  
	  //Assertion
	  boolean isDashboardLoaded=login.isDashboardDisplayed();
	  assertTrue(isDashboardLoaded,Constants.ERRORMESSAGEFORLOGIN);
  	}
  @Test(priority=2)
  public void adminLogout()
  	{
	  Login login=new Login(driver);
	  String useramefield="admin";
	  String passwordfield="admin"; 	  
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();	  
	  login.adminLogout();
	  boolean loginPageDisplayed=login.isLoginPageDisplayed();
	  assertTrue(loginPageDisplayed,Constants.ERRORMESSAGEFORLOGOUT);
  	}
  @Test(priority=3)
  public void enterValidUsernameandinvalidUsername()
   	{
	  Login login=new Login(driver);
	  String useramefield="admin";
	  String passwordfield="password"; 	  
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();	
	  boolean invalidPasswordAlert=login.isAlertforInvalidUsernameORPasswordAvailable();
	  assertTrue(invalidPasswordAlert,Constants.ERRORMESSAGEFORINVALIDPASSWORD);
   	}
   @Test(priority=4)
   public void enterInvalidUserNameandValidPassword()
   {
		  Login login=new Login(driver);
		  String useramefield="user";
		  String passwordfield="admin"; 	  
		  login.enterValidUsername(useramefield);
		  login.enterValidPassword(passwordfield);
		  login.clickLoginbutton();	
		  boolean invalidPasswordAlert=login.isAlertforInvalidUsernameORPasswordAvailable();
		  assertTrue(invalidPasswordAlert,Constants.ERRORMESSAGEFORINVALIDUSERNAME);
   }
   @Test(priority=5)
   public void enteInvalidUserNameandPassword()
   {
	      Login login=new Login(driver);
		  String useramefield="user";
		  String passwordfield="password"; 	  
		  login.enterValidUsername(useramefield);
		  login.enterValidPassword(passwordfield);
		  login.clickLoginbutton();	
		  boolean invalidPasswordAlert=login.isAlertforInvalidUsernameORPasswordAvailable();
		  assertTrue(invalidPasswordAlert,Constants.ERRORMESSAGEFORINVALIDUSER);
   }
}