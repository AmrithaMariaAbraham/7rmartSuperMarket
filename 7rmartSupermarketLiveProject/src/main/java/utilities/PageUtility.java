package utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility 
{
	WebDriver driver;
	//Dropdown,Select,drag,ScrollDown-->
	
	public void selectIndex(WebElement elementindex)
	{
		Select select=new Select(elementindex);
		select.selectByIndex(0);
	}
	public void ScrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
	}
}
