package pages;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExcelUtility;
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
	
	public void clickAdminUsers()
	{
		adminUsers.click();
	}
	public void clickNew()
	{
		clickNew.click();
	}
	public void enterUsername() throws IOException
	{
		enterUsername.click();		
		String username=ExcelUtility.getStringData(1,0,"AdminUsers");
		//Wait.Wait(enterUSername);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(enterUsername));
		System.out.println(username);
		enterUsername.sendKeys(username);
	}
	public void enterPassword() throws IOException
	{
		enterpassword.click();
		String Password=ExcelUtility.getIntegerData(1,1,"AdminUsers");
		//Wait.Wait(enterpassword);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(enterpassword));		
		System.out.println(enterpassword);
		enterpassword.sendKeys(Password);
	}
	public void selectUserTypeFromDropdown()
	{
		page.selectUserType(userType);
	}
	public void clickSaveButton()
	{
		clickSaveButton.click();
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}
}
