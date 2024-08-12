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


	public void enterValidUsername(String username) {
		userName.sendKeys(username);
	}
	
	public void enterValidPassword(String passWord) {
		password.sendKeys(passWord);
	}
	
	
	public void clicLoginbutton() {
		siginButton.click();
	}
	
	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();
	}
}