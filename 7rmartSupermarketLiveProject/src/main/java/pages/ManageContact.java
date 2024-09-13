package pages;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageContact 
{
	WebDriver driver;
	
	public ManageContact(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		
	PageUtility page=new PageUtility();
	WaitUtility Wait=new WaitUtility();
	FileUploadUtility fileUpload=new FileUploadUtility();
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[5]") WebElement ManageContact;
	@FindBy(xpath="//i[@class='fas fa-edit']") WebElement clickEdit;
	@FindBy(xpath="//input[@id='phone']") WebElement phoneNumber;
	@FindBy(xpath="//input[@id='email']") WebElement editEmail;
	@FindBy(xpath="//textarea[@name='address']") WebElement editAddress;
	@FindBy(xpath="//textarea[@name='del_time']") WebElement editDeliveryTime;
	@FindBy(xpath="//input[@id='del_limit']") WebElement editDeliveryChargeLimit;
	@FindBy(xpath="//button[@name='Update']") WebElement clickUpdateButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertDisplayed;
	@FindBy(xpath="//a[text()='Home']") WebElement homePage;
	
	public ManageContact clickManageContact()
	{
		ManageContact.click();
		return this;
	}
	public ManageContact clickEditButton()
	{
		clickEdit.click();
		return this;
	}
	public ManageContact enterPhonenumber(String phone) throws IOException, AWTException
	{
		phoneNumber.click();
		fileUpload.selectAll();	
		System.out.println(phone);
		phoneNumber.sendKeys(phone);
		return this;
	}
	public ManageContact editEmail(String email) throws IOException, AWTException
	{
		editEmail.click();
		fileUpload.selectAll();		
		editEmail.sendKeys(email);
		return this;
	}
	public ManageContact editAddress(String address) throws AWTException, IOException
	{
		editAddress.click();
		fileUpload.selectAll();		
		editAddress.sendKeys(address);
		return this;
	}
	public ManageContact editdeliverytime(String time) throws AWTException
	{
		editDeliveryTime.click();
		fileUpload.selectAll();
		editDeliveryTime.sendKeys(time);
		return this;
	}
	public ManageContact editDeliveryChargeLimit(String deliveryCharge) throws AWTException 
	{
		editDeliveryChargeLimit.click();
		fileUpload.selectAll();		
		editDeliveryChargeLimit.sendKeys(deliveryCharge);
		return this;
	}
	public ManageContact homepageClick()
	{
		homePage.click();
		return this;
	}
	public ManageFooter clickUpdateButton() throws InterruptedException
	{
		page.scrollDownX320Y320();
		Wait.Wait(clickUpdateButton);
		clickUpdateButton.click();
		return new ManageFooter(driver);
	}
	public boolean isAlertDisplayed() 
	{
		return alertDisplayed.isDisplayed();
	}
}
