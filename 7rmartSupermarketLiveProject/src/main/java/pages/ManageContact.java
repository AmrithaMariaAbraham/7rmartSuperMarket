package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContact 
{
	WebDriver driver;
	public ManageContact(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-edit']") WebElement ManageContent;
	@FindBy(xpath="(//p[text()='Manage News'])[1]") WebElement ManageNews;
	@FindBy(xpath="//p[text()='Manage Contact']") WebElement ManageContact;
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss']") WebElement clickEdit;
	@FindBy(xpath="//input[@id='email']") WebElement editEmail;
	@FindBy(xpath="//textarea[@name='del_time']") WebElement editDeliveryTime;
	@FindBy(xpath="//input[@id='del_limit']") WebElement editDeliveryChargeLimit;
	@FindBy(xpath="//button[@name='Update']") WebElement clickUpdateButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertDisplayed;
	
	public void clickManageContent()
	{
		ManageContent.click();
		ManageNews.click();
	}
	public void clickManageContact()
	{
		
		ManageContact.click();
	}
	public void clickEditButton()
	{
		clickEdit.click();
	}
	public void editEmail(String email)
	{
		editEmail.sendKeys(email);
	}
	public void editdeliverytime(String time)
	{
		editDeliveryTime.sendKeys(time);
	}
	public void editDeliveryChargeLimit(String deliveryChargeLimit)
	{
		editDeliveryChargeLimit.sendKeys(deliveryChargeLimit);
	}
	public void clickUpdateButton()
	{
		clickUpdateButton.click();
	}
	public boolean isAlertDisplayed() 
	{
		return alertDisplayed.isDisplayed();
	}

}
