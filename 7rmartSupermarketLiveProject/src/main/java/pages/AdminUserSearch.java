package pages;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUserSearch 
{
	WebDriver driver;
	
	public AdminUserSearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	PageUtility page=new PageUtility();
	WaitUtility Wait=new WaitUtility();
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[1]") WebElement adminUsers;
	@FindBy(xpath="//a[@onclick='click_button(2)']") WebElement clickSearch;
	@FindBy(xpath="//input[@id='un']") WebElement enterUsername;
	@FindBy(xpath="//select[@id='ut']") WebElement userType;
	@FindBy(xpath="(//button[@type='submit'])[1]") WebElement searchButton;
	@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]") WebElement delete;
	@FindBy(xpath="//div[@class='card-body table-responsive p-0']") WebElement alertSearch;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertDelete;
	
	public AdminUserSearch clickAdminUsers()
	{
		adminUsers.click();
		return this;
	}	
	public AdminUserSearch clickSearch()
	{
		clickSearch.click();
		return this;
	}
	public AdminUserSearch enterUsername(String username) throws IOException
	{
		enterUsername.click();			
		//Wait.Wait(enterUsername);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(enterUsername));
		System.out.println(username);
		enterUsername.sendKeys(username);
		return this;
	}
	public AdminUserSearch selectUserTypeFromDropdown()
	{
		page.selectUserType(userType);
		return this;
	}
	public AdminUserSearch selectSearchButton()
	{
		searchButton.click();
		return this;
	}
	public ManageCategoryNew deleteSearchedValue()
	{
		delete.click();
		driver.switchTo().alert().accept();
		return new ManageCategoryNew(driver);
	}
	public boolean isSearchAlertDisplayed()
	{
		return alertSearch.isDisplayed();
	}
	public boolean isDeleteAlertDisplayed()
	{
		return alertDelete.isDisplayed();
	}
}
