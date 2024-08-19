package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooter 
{
	WebDriver driver;
	public ManageFooter(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-edit']") WebElement ManageContent;
	@FindBy(xpath="//p[text()='Manage Footer Text']") WebElement ManageFooterText;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']") WebElement edit1;
	@FindBy(xpath="//textarea[@name='address']") WebElement Address;
	@FindBy(xpath="//input[@id='email']") WebElement email;
	@FindBy(xpath="//button[@name='Update']") WebElement updatebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertVisible;
	
	public void clickManageContent()
	{
		ManageContent.click();
	}
	public void clickManageFooterText()
	{
		ManageFooterText.click();
	}
	public void editFooterTextValue() 
	{
		edit1.click();
	}
	public void editAdrdess(String address)
	{
		Address.sendKeys(address);
	}
	public void editEmail(String Email)
	{
		email.sendKeys(Email);
	}
	public void clickUpdateButton()
	{
		updatebutton.click();
	}
	public boolean isFooterDisplayedSuccessfullydisplayed()
	{
		return alertVisible.isDisplayed();
	}
}
