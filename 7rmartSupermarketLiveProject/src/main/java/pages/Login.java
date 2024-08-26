package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class Login 
	{
		WebDriver driver;
	
	public Login(WebDriver driver) 
	{		
			this.driver=driver;
			PageFactory.initElements(driver,this);//Page factory defined
	}
	@FindBy(xpath="//input[@name='username']") WebElement userName;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']") WebElement siginButton;
	@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement adminDropdown;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logoutClick;
	@FindBy(xpath="//div[@class='login-box']") WebElement loginPage;
	@FindBy(xpath="//i[@class='icon fas fa-ban']") WebElement alertSymbol;
	
	public void enterValidUsername(String useramefield) 
	{
		userName.sendKeys(useramefield);
	}	
	public void enterValidPassword(String passwordfield)
	{
		password.sendKeys(passwordfield);
	}
	public void invalidPassword(String passwordfield) 
	{
		 password.sendKeys(passwordfield);
	}
	public void invalidUserName(String useramefield)
	{
		
		userName.sendKeys(useramefield);
	}
	public void clickLoginbutton() 
	{
		siginButton.click();
	}	
	public boolean isDashboardDisplayed() 
	{
		return dashboard.isDisplayed();
	}
	public void adminLogout()
	{
		adminDropdown.click();
		logoutClick.click();
	}
	public boolean isLoginPageDisplayed()
	{
		return loginPage.isDisplayed();
	}
	public boolean isAlertforInvalidUsernameORPasswordAvailable()
	{
		return alertSymbol.isDisplayed();
	}
}