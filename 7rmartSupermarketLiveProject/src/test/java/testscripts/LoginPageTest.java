package testscripts;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import constants.Constants;
import pages.Login;
import utilities.ExcelUtility;

public class LoginPageTest extends Base
{
	@DataProvider(name="credentials")
	public Object[][] testData()
	{
		// data provider
		Object[][] input = new Object[2][2];
		input[0][0] = "admin";
		input[0][1] = "admin";
		input[1][0] = "admin@123";
		input[1][1] = "admin123";
		return input;
	}

  @Test(priority=1,retryAnalyzer = reTry.Retry.class,dataProvider="credentials",groups = {"Smoke"})
  @Parameters({"username","password"})
  public void enterValidUsernameAndPassword(String useramefield,String passwordfield) throws IOException, InterruptedException 
  	{	  
	  Login login=new Login(driver);	   	  
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);	  
	  login.clickLoginbutton();	 
	  System.out.println("Valid username password");
	  login.adminLogout();
	  System.out.println("Logout");
	  boolean loginPageDisplayed=login.isLoginPageDisplayed();
	  assertTrue(loginPageDisplayed,Constants.ERRORMESSAGEFORLOGOUT);
  }
  @Test(priority=2, groups= "Smoke")
   public void enterValidUsernameandinvalidPasword() throws IOException
   	{
	  String usernamefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(2,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(usernamefield);
	  login.invalidPassword(passwordfield);
	  login.clickLoginbutton();	
	  System.out.println("Valid username Invalid password");
	  boolean invalidPasswordAlert=login.isAlertforInvalidUsernameORPasswordAvailable();
	  assertTrue(invalidPasswordAlert,Constants.ERRORMESSAGEFORINVALIDPASSWORD);
   	}
   @Test(priority=3, groups = "Smoke")
   @Parameters({"username","password"})
   public void enterInvalidUserNameandValidPassword() throws IOException 
   {
	      String useramefield=ExcelUtility.getStringData(2,0,"LoginDetails");
	      String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
		  Login login=new Login(driver);
		  login.invalidUserName(useramefield);
		  login.enterValidPassword(passwordfield);
		  login.clickLoginbutton();	
		  System.out.println("Invalid username Valid Password");
		  boolean invalidPasswordAlert=login.isAlertforInvalidUsernameORPasswordAvailable();
		  assertTrue(invalidPasswordAlert,Constants.ERRORMESSAGEFORINVALIDUSERNAME);
   }
   @Test(priority=4, groups ="Smoke")
   public void enteInvalidUserNameandPassword() throws IOException
   {
	      String useramefield=ExcelUtility.getStringData(2,0,"LoginDetails");
	      String passwordfield=ExcelUtility.getStringData(2,1,"LoginDetails");
	      Login login=new Login(driver);
		  login.invalidUserName(useramefield);
		  login.invalidPassword(passwordfield);
		  login.clickLoginbutton();	
		  System.out.println("Invalid username password");
		  boolean invalidPasswordAlert=login.isAlertforInvalidUsernameORPasswordAvailable();
		  assertTrue(invalidPasswordAlert,Constants.ERRORMESSAGEFORINVALIDUSER);
   }
}