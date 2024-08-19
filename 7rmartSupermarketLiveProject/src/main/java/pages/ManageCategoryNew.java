package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategoryNew 
{
	WebDriver driver;
	public ManageCategoryNew(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[4]") WebElement ManageCategory;		
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement New;
	@FindBy(xpath="//input[@id='category']") WebElement enterCategoryValue;	
	@FindBy(xpath="//li[@id='134-selectable']")WebElement selectGroup;
	@FindBy(xpath="//input[@type='file']") WebElement uploadImage;	
	@FindBy(xpath="//button[@name='create']") WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	public void clickManageCategory()
	{
		ManageCategory.click();
	}
	public void clickAddButton()
	{
		New.click();
	}
	public void enterCategoryValue(String categoryValue)
	{
		enterCategoryValue.sendKeys(categoryValue);
	}
	public void selectAValuefromSelectGroup()
	{
		selectGroup.click();
	}
	public void uploadDiscountImage()
	{
		uploadImage.click();
		uploadImage.sendKeys("C:\\Users\\amrit\\Downloads\\discount.jpeg");
	}
	public void clickSaveButton()
	{
		save.click();
	}
	public boolean isAlertdisplayed()
	{
		return alert.isDisplayed();
	}
	
}
