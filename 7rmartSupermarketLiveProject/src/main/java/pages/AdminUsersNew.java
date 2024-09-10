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

public class AdminUsersNew
{
	WebDriver driver;
	public AdminUsersNew(WebDriver driver)
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
	
	public AdminUsersNew clickAdminUsers()
	{
		adminUsers.click();
		return this;
	}
	public AdminUsersNew clickNew()
	{
		clickNew.click();
		return this;
	}
	public AdminUsersNew enterUsername(String username) throws IOException
	{
		enterUsername.click();		
		//Wait.Wait(enterUsername);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(enterUsername));
		System.out.println(username);
		enterUsername.sendKeys(username);
		return this;
	}
	public AdminUsersNew enterPassword(String Password) throws IOException
	{
		enterpassword.click();
		//Wait.Wait(enterpassword);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(enterpassword));		
		System.out.println(enterpassword);
		enterpassword.sendKeys(Password);
		return this;
	}
	public AdminUsersNew selectUserTypeFromDropdown()
	{
		page.selectUserType(userType);
		return this;
	}
	public AdminUserSearch clickSaveButton()
	{
		clickSaveButton.click();
		return new AdminUserSearch(driver);
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}
}
