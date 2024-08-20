package pages;
import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[12]") WebElement ManageFooterText;
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
	public void editAddress(String address) throws AWTException
	{
		Address.click();
		fileUpload.selectAll();
		Address.sendKeys(address);
	}
	public void editEmail(String Email) throws AWTException
	{
		email.click();
		fileUpload.selectAll();
		email.sendKeys(Email);
	}
	public void editPhoneNumber(String Phone) throws AWTException
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
