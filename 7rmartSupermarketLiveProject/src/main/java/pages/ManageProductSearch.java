package pages;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class ManageProductSearch
{
	WebDriver driver;
	public ManageProductSearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[12]") WebElement manageProduct;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchButton;
	@FindBy(xpath="//input[@name='un']") WebElement Title;
	@FindBy(xpath="//input[@name='cd']") WebElement ProductCode;
	@FindBy(xpath="//select[@id='cat_id']") WebElement Category;
	@FindBy(xpath="//select[@id='sb']") WebElement subCategory;
	@FindBy(xpath="//button[@value='sr']") WebElement search;
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement adminDropdown;
	@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement alert;

	PageUtility page=new PageUtility();
	
	public void clickManageProduct()
	{
		manageProduct.click();
	}	
	public void clickSearchButton()
	{
		searchButton.click();
	}
	public void enterTitle(String title)
	{
		Title.sendKeys(title);
	}
	public void enterProductCode(String productCode)
	{
		ProductCode.sendKeys(productCode);
	}
	public void selectCategoryfromDropdown()
	{
		//Select dropdown=new Select(Category);
		//dropdown.selectByIndex(1);
		page.waitforCategory(Category);
		page.selectCategoryFromDropDown(Category);
	}
	public void selectSubCategoryfromDropDown()
	{
		/*Select dropdown=new Select(subCategory);
		dropdown.selectByIndex(1);*/
		page.waitforSubCategory(subCategory);
		page.selectsubCategory(subCategory);
	}
	public void clickSearch()
	{
		search.click();
	}
	public boolean issearchAlertDisplayed()
	{
		return alert.isDisplayed();
		
	}
}
