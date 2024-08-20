package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUserSearch 
{
	WebDriver driver;
	public AdminUserSearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	PageUtility page=new PageUtility();
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[1]") WebElement adminUsers;
	@FindBy(xpath="//a[@onclick='click_button(2)']") WebElement clickSearch;
	@FindBy(xpath="//input[@id='un']") WebElement enterUsername;
	@FindBy(xpath="//select[@id='ut']") WebElement userType;
	@FindBy(xpath="(//button[@type='submit'])[1]") WebElement searchButton;
	@FindBy(xpath="//div[@class='card-body table-responsive p-0']") WebElement alert;
	public void clickAdminUsers()
	{
		adminUsers.click();
	}	
	public void clickSearch()
	{
		clickSearch.click();
	}
	public void enterUsername(String userName)
	{
		enterUsername.sendKeys(userName);
	}
	public void selectUserTypeFromDropdown()
	{
		page.selectUserType(userType);
	}
	public void selectSearchButton()
	{
		searchButton.click();
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}
}
