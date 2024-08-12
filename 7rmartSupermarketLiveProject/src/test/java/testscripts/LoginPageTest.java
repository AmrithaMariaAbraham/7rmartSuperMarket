package testscripts;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pages.Login;

public class LoginPageTest extends Base
{
  @Test
  public void enterValidUsernameAndPassword() 
  {	  
	  String useramefield="admin";
	  String passwordfield="admin";  
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();	  
	  //Assertion
	  boolean isDashboardLoaded=login.isDashboardDisplayed();
	  assertTrue(isDashboardLoaded, "Dashboard not loaded");
	  login.adminLogout();
	  boolean loginPageDisplayed=login.isLoginPageDisplayed();
	  assertTrue(loginPageDisplayed, "Login page not displayed"); 	  
  }
}