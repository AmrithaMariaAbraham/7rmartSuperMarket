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
	public void selectCategoryFromDropDown(WebElement category)
	{
		Select dropdown=new Select(category);
		dropdown.selectByIndex(0);
	}
	public void selectSubCategoryFromDropDown(WebElement subCategory)
	{
		Select dropdown=new Select(subCategory);
		dropdown.selectByIndex(0);
	}
	public void selectGroupIDfromDropDown(WebElement groupID)
	{
		Select dropdown=new Select(groupID);
		dropdown.selectByIndex(1);
	}
}
