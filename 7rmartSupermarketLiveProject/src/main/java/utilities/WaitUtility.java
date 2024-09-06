package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitUtility 
{
	WebDriver driver;
	
		public void waitforCategory(WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		public void waitforSubCategory(WebElement element1)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
			wait.until(ExpectedConditions.elementToBeClickable(element1));
		}
		public void Wait(WebElement element2)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(element2));
		}
		public void wait(WebElement element3)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(element3));
		}
		public void waiting(WebElement element4)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(element4));
		}
	}
	
