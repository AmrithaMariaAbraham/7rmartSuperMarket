package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	@FindBy(xpath="//a[text()='Home']") WebElement homePage;
	public void homepageClick()
	{
		homePage.click();
		
	}
}
