package testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constants;
import utilities.ScreenShotUtility;

public class Base 
{
	WebDriver driver;
	ScreenShotUtility scrshot;
	public Properties properties;
	public FileInputStream fis;
	
	@BeforeMethod(alwaysRun = true)
	@Parameters("Browser")
	  public void initializeMethod(String browser) throws Exception 
	   {
		try 
		{
			properties = new Properties();
			fis = new FileInputStream(Constants.CONFIGFILE);
			properties.load(fis);
		} 
		catch (FileNotFoundException exception) 
		{
			exception.printStackTrace();
		}
		if (browser.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		} 
		else if (browser.equalsIgnoreCase("edge")) 
		{
			driver = new EdgeDriver();
		} 
		else if (browser.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
		} 
		else 
		{
			throw new Exception("invalid browser");
		}
	    driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
	   }
	 
		 @AfterMethod
	  	 public void browserQuit(ITestResult itestresult) throws IOException 
	  	 {
			if (itestresult.getStatus() == ITestResult.FAILURE) 
			{
				scrshot = new ScreenShotUtility();
				scrshot.captureFailureScreenShot(driver, itestresult.getName());				
			}
			driver.quit();
	  	}
}