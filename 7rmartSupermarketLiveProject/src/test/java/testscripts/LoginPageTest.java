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

  @Test(priority=1,retryAnalyzer = reTry.Retry.class, dataProvider = "credentials")
  public void enterValidUsernameAndPassword(String useramefield,String passwordfield) throws IOException 
  	{	  
	  //String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  //String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);	   	  
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);	  
	  login.clickLoginbutton();	  
	  //Assertion
	  boolean isDashboardLoaded=login.isDashboardDisplayed();
	  assertTrue(isDashboardLoaded,Constants.ERRORMESSAGEFORLOGIN);
  	}
  @Test(priority=2)
    public void adminLogout() throws IOException 
  	{	  
	  String usernamefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(usernamefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();	  
	  login.adminLogout();
	  boolean loginPageDisplayed=login.isLoginPageDisplayed();
	  assertTrue(loginPageDisplayed,Constants.ERRORMESSAGEFORLOGOUT);
  	}
  @Test(priority=3)
   public void enterValidUsernameandinvalidPasword() throws IOException
   	{
	  String usernamefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(2,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(usernamefield);
	  login.invalidPassword(passwordfield);
	  login.clickLoginbutton();	
	  boolean invalidPasswordAlert=login.isAlertforInvalidUsernameORPasswordAvailable();
	  assertTrue(invalidPasswordAlert,Constants.ERRORMESSAGEFORINVALIDPASSWORD);
   	}
   @Test(priority=4)
   @Parameters({"username","password"})
   public void enterInvalidUserNameandValidPassword() throws IOException 
   {
	      String useramefield=ExcelUtility.getStringData(2,0,"LoginDetails");
	      String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
		  Login login=new Login(driver);
		  login.invalidUserName(useramefield);
		  login.enterValidPassword(passwordfield);
		  login.clickLoginbutton();	
		  boolean invalidPasswordAlert=login.isAlertforInvalidUsernameORPasswordAvailable();
		  assertTrue(invalidPasswordAlert,Constants.ERRORMESSAGEFORINVALIDUSERNAME);
   }
   @Test(priority=5)
   public void enteInvalidUserNameandPassword() throws IOException
   {
	      String useramefield=ExcelUtility.getStringData(2,0,"LoginDetails");
	      String passwordfield=ExcelUtility.getStringData(2,1,"LoginDetails");
	      Login login=new Login(driver);
		  login.invalidUserName(useramefield);
		  login.invalidPassword(passwordfield);
		  login.clickLoginbutton();	
		  boolean invalidPasswordAlert=login.isAlertforInvalidUsernameORPasswordAvailable();
		  assertTrue(invalidPasswordAlert,Constants.ERRORMESSAGEFORINVALIDUSER);
   }
}