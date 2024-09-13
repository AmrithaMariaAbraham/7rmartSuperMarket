package pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUsers
{
	WebDriver driver;
	public AdminUsers(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	PageUtility page=new PageUtility();
	WaitUtility Wait=new WaitUtility();
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[1]") WebElement adminUsers;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement clickNew;
	@FindBy(xpath="//input[@id='username']") WebElement enterUsername;
	@FindBy(xpath="//input[@id='password']") WebElement enterpassword;
	@FindBy(xpath="//select[@id='user_type']") WebElement userType;
	@FindBy(xpath="//button[@name='Create']") WebElement clickSaveButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchButton;
	@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]") WebElement delete;
	
	public AdminUsers clickAdminUsers() 
	{	
		adminUsers.click();
		return this;
	}
	public AdminUsers clickNew()
	{
		clickNew.click();
		return this;
	}
	public AdminUsers enterUsername(String username) throws IOException
	{
		enterUsername.click();		
		Wait.Wait(enterUsername);
		System.out.println(username);
		enterUsername.sendKeys(username);
		return this;
	}
	public AdminUsers enterPassword(String Password) throws IOException
	{
		enterpassword.click();
		Wait.Wait(enterpassword);
		System.out.println(Password);
		enterpassword.sendKeys(Password);
		return this;
	}
	public AdminUsers selectUserTypeFromDropdown()
	{
		page.selectUserType(userType);
		return this;
	}
	public AdminUsers clickSaveButton()
	{
		clickSaveButton.click();
		return this;
	}
	public AdminUsers selectSearchButton()
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
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}
}
