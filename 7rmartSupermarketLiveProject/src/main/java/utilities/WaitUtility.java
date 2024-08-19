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
	public void waitforChooseFile()
	{
		WebElement element=driver.findElement(By.xpath("//input[@id='main_img']"));
		ManageCategoryNew category=new ManageCategoryNew(driver); 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
}
