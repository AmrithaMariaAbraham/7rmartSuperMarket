package pages;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constants;
import utilities.ExcelUtility;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategoryNew 
{
	WebDriver driver;
	public ManageCategoryNew(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	PageUtility page=new PageUtility();
	FileUploadUtility fileupload=new FileUploadUtility();
	WaitUtility Wait=new WaitUtility();
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[3]") WebElement clickCategory;		
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement New;
	@FindBy(xpath="//input[@id='category']") WebElement enterCategoryValue;	
	@FindBy(xpath="//li[@id='134-selectable']")WebElement selectGroup;
	@FindBy(xpath="//input[@id='main_img']") WebElement uploadImage;	
	@FindBy(xpath="//button[text()='Save']") WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	public void clickCategory()
	{
		clickCategory.click();
	}
	public void clickAddButton()
	{
		New.click();
	}
	public void enterCategoryValue() throws IOException
	{
		enterCategoryValue.click();
		String CateValue=ExcelUtility.getStringData(1,0,"ManageCategoryNew");
		System.out.println(CateValue);
		enterCategoryValue.sendKeys(CateValue);
	}
	public void selectAValuefromSelectGroup()
	{
		selectGroup.click();
	}
	public void uploadDiscountImage()
	{
		//page.scrollDownX250Y250();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,250)");
		fileupload.uploadDiscountImageForManageCategory(uploadImage,Constants.DISCOUNTIMAGE);
	}
	public void clickSaveButton() throws InterruptedException
	{
		//page.scrollDownX280Y280();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(435,435)");
		//Wait.waitforCategory(save);
		//System.out.println("Waiting...");
		Thread.sleep(3000);
		save.click();
		System.out.println(save);
	}
	public boolean isAlertdisplayed()
	{
		return alert.isDisplayed();
	}
	
}
