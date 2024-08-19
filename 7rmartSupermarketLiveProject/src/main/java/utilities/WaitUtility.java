package utilities;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ManageCategoryNew;

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
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element1));
		}
	}
	
