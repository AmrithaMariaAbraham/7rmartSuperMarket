package utilities;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtility 
{
	WebDriver driver;
	//Dropdown,Select,drag,ScrollDown-->
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
	public void selectIndex(WebElement elementindex)
	{
		Select select=new Select(elementindex);
		select.selectByIndex(0);
	}
	public void selectfromDropDown(WebElement element)
	{
		Select select=new Select(element);
		select.selectByIndex(1);
	}
	public void selectCategoryFromDropDown(WebElement category)
	{
		Select select=new Select(category);
		//select.selectByValue("27");
		select.selectByIndex(1);
	}
	public void selectsubCategory(WebElement subCategory)
	{
		Select select=new Select(subCategory);
		//select.selectByVisibleText("Category1");
		select.selectByIndex(2);
	}
	public void ScrollDownX250Y250()
	{
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(250,250)");
	}
	public void scrollDownX380Y380()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(380,380)");
	}
	public void scrollDownX893Y61()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(893,61)");
	}
	public void scrollDownX900Y900()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(900,900)");
	}
	public void scrollBackToTop()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");		
	}
	
}
