package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageCategorySearch 
{
	WebDriver driver;
	public ManageCategorySearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-list-alt']") WebElement ManageCategory;
	@FindBy(xpath="//p[text()='Sub Category']") WebElement subCategory;
	@FindBy(xpath="//i[@class='fa fa-search']]") WebElement subcategorySearchButton;
	@FindBy(xpath="//sele WebElementct[@id='un']") WebElement category;	
	@FindBy(xpath="//input[@name='ut']") WebElement subCategoryInputValue;	
	@FindBy(xpath="//button[@type='submit']") WebElement searchButtonClick;	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']") WebElement subCategorytitle;
	
	public void clickManageCategory()
	{
		ManageCategory.click();
	}
	public void clicksubCategory()
	{
		subCategory.click();
	}
	public void searchSubCategory()
	{
		subcategorySearchButton.click();
	}
	public void selectSubCategoryValueforSearch()
	{
		Select dropdown=new Select(category);
		dropdown.selectByValue("Apple");
	}
	public void enterSubCategoryValue(String subcategoryvalue)
	{
		subCategoryInputValue.sendKeys(subcategoryvalue);		
	}
	public void clickSearchButtonforParticularCategorySeach()
	{
		searchButtonClick.click();
	}
	public void isCategoryTitleDisplayed()
	{
		subCategorytitle.click();
		boolean titledisplay=subCategorytitle.isDisplayed();
		assertTrue(titledisplay,"Title not displayed");
	}
	
	
}
