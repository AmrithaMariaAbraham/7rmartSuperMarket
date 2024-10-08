package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

	public class Login 
	{
	WebDriver driver;
	WaitUtility Wait= new WaitUtility();
	
	public Login(WebDriver driver) 
	{		
			this.driver=driver;
			PageFactory.initElements(driver,this);//Page factory defined
	}
	
	@FindBy(xpath="//input[@name='username']") WebElement userName;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']") WebElement siginButton;
	@FindBy(xpath="//a[text()='Home']") WebElement homePage;
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement adminDropdown;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logoutClick;
	@FindBy(xpath="//div[@class='login-box']") WebElement loginPage;
	@FindBy(xpath="//i[@class='icon fas fa-ban']") WebElement alertSymbol;
	@FindBy(xpath="(//a[@class='small-box-footer'])[1]") WebElement adminUsers;
	@FindBy(xpath="(//a[@class='small-box-footer'])[3]") WebElement clickCategory;
	
	public Login enterValidUsername(String useramefield) 
	{
		userName.sendKeys(useramefield);
		return this;
	}	
	public Login enterValidPassword(String passwordfield)
	{
		password.sendKeys(passwordfield);
		return this;
	}
	public Login invalidPassword(String passwordfield) 
	{
		password.sendKeys(passwordfield);
		return this;
	}
	public Login invalidUserName(String useramefield)
	{		
		userName.sendKeys(useramefield);
		return this;
	}
	public AdminUsers clickLoginbutton() 
	{
		siginButton.click();
		return new AdminUsers(driver);
	}	
	public boolean isHomePageDisplayed() 
	{
		Wait.implicitWait();
		return homePage.isDisplayed();
	}
	public AdminUsers clickAdminUsers() 
	{
		adminUsers.click();
		return new AdminUsers(driver);
	}
	public ManageCategoryNew clickCategory()
	{
		clickCategory.click();
		return new ManageCategoryNew(driver);
	}
	public Login adminLogout()
	{
		homePage.click();
		adminDropdown.click();
		logoutClick.click();
		return this;
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