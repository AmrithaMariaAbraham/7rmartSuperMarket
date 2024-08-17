package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategoryAdd 
{
	WebDriver driver;
	public ManageCategoryAdd(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='nav-link active']") WebElement ManageCategory;
	@FindBy(xpath="//p[text()='Category']") WebElement Category;	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newCategory;
	@FindBy(xpath="//input[@id='category']") WebElement enterCategoryValue;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement selectGroup;
	@FindBy(xpath="//button[text()='Save']") WebElement save;
	@FindBy(xpath="//i[@class='icon fas fa-check']")WebElement alert;
	
	public void clickManageCategory()
	{
		ManageCategory.click();
	}
	public void clickCategory()
	{
		Category.click();
	}
	public void clickAddButton()
	{
		newCategory.click();
	}
	public void enterCategoryValue(String categoryValue)
	{
		enterCategoryValue.sendKeys(categoryValue);
	}
	public void selectAValuefromSelectGroup()
	{
		selectGroup.click();
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
