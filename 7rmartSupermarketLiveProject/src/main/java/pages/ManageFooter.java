package pages;
import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExcelUtility;
import utilities.FileUploadUtility;

public class ManageFooter 
{
	WebDriver driver;
	public ManageFooter(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	FileUploadUtility fileUpload=new FileUploadUtility();
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[10]") WebElement ManageFooterText;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']") WebElement edit1;
	@FindBy(xpath="//textarea[@name='address']") WebElement Address;
	@FindBy(xpath="//input[@id='email']") WebElement email;
	@FindBy(xpath="//input[@id='phone']") WebElement phone;
	@FindBy(xpath="//button[@name='Update']") WebElement updatebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertVisible;
	
	public void clickManageFooterText()
	{
		ManageFooterText.click();
	}
	public void editFooterTextValue() 
	{
		edit1.click();
	}
	public void editAddress(String address) throws AWTException, IOException
	{
		Address.click();
		fileUpload.selectAll();		
		Address.sendKeys(address);
	}
	public void editEmail(String EMail) throws AWTException, IOException
	{
		email.click();
		fileUpload.selectAll();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(email));
		email.sendKeys(EMail);
	}
	public void editPhoneNumber(String Phone) throws AWTException, IOException
	{
		phone.click();
		fileUpload.selectAll();		
		phone.sendKeys(Phone);
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
