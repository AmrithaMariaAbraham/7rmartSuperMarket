package pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import constants.Constants;
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
	@FindBy(xpath="//a[text()='Home']") WebElement homePage;
	
	public ManageCategoryNew clickCategory()
	{
		clickCategory.click();
		return this;
	}
	public ManageCategoryNew clickAddButton()
	{
		New.click();
		return this;
	}
	public ManageCategoryNew enterCategoryValue(String CateValue) throws IOException
	{
		enterCategoryValue.click();
		enterCategoryValue.sendKeys(CateValue);
		return this;
	}
	public ManageCategoryNew selectAValuefromSelectGroup()
	{
		selectGroup.click();
		return this;
	}
	public ManageCategoryNew uploadDiscountImage()
	{
		page.scrollDownX250Y250();
		fileupload.uploadimage(uploadImage,Constants.DISCOUNTIMAGE);
		return this;
	}
	public ManageCategoryNew hompageclick()
	{
		homePage.click();
		return this;
	}
	public ManageContact clickSaveButton() throws InterruptedException
	{
		page.scrollDownX430Y430();
		Wait.waitforCategory(save);
		save.click();
		return new ManageContact(driver);
	}
	public boolean isAlertdisplayed()
	{
		return alert.isDisplayed();
	}	
}
