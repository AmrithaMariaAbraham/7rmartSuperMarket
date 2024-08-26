package pages;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	
	public void clickManageContact()
	{
		ManageContact.click();
	}
	public void clickEditButton()
	{
		clickEdit.click();
	}
	public void enterPhonenumber(String phone) throws IOException, AWTException
	{
		phoneNumber.click();
		fileUpload.selectAll();	
		System.out.println(phone);
		phoneNumber.sendKeys(phone);
	}
	public void editEmail(String email) throws IOException, AWTException
	{
		editEmail.click();
		fileUpload.selectAll();		
		editEmail.sendKeys(email);
	}
	public void editAddress(String address) throws AWTException, IOException
	{
		editAddress.click();
		fileUpload.selectAll();		
		editAddress.sendKeys(address);
	}
	public void editdeliverytime(String time) throws AWTException, IOException
	{
		editDeliveryTime.click();
		fileUpload.selectAll();
		editDeliveryTime.sendKeys(time);
	}
	public void editDeliveryChargeLimit(String deliveryCharge) throws AWTException, IOException
	{
		editDeliveryChargeLimit.click();
		fileUpload.selectAll();		
		editDeliveryChargeLimit.sendKeys(deliveryCharge);
	}
	public void clickUpdateButton() throws InterruptedException
	{
		//page.scrollDownX250Y250();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(310,310)");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(clickUpdateButton));
		clickUpdateButton.click();
	}
	public boolean isAlertDisplayed() 
	{
		return alertDisplayed.isDisplayed();
	}

}
