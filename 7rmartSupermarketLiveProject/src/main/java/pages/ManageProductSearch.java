package pages;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageProductSearch
{
	WebDriver driver;
	public ManageProductSearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//p[text()='Manage Product']") WebElement clickManageProd;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchButton;
	@FindBy(xpath="//input[@name='un']") WebElement Title;
	@FindBy(xpath="//input[@name='cd']") WebElement ProductCode;
	@FindBy(xpath="//select[@id='cat_id']") WebElement Category;
	@FindBy(xpath="//select[@id='sb']") WebElement subCategory;
	@FindBy(xpath="//button[@value='sr']") WebElement search;
	@FindBy(xpath="//span[@id='res']") WebElement resultNotFound;
	@FindBy(xpath="//a[text()='Home']") WebElement Home;
	@FindBy(xpath="//a[@class='d-block']") WebElement Admin;
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement adminDropdown;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logoutClick;
	
	public void clickManageProduct()
	{
		clickManageProd.click();
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
		Select dropdown=new Select(Category);
		dropdown.selectByIndex(1);
	}
	public void selectSubCategoryfromDropDown()
	{
		Select dropdown=new Select(subCategory);
		dropdown.selectByIndex(1);
	}
	public void clickSearch()
	{
		search.click();
	}
	public void isresultFoundDisplayed()
	{
		boolean ResultNotFound=resultNotFound.isDisplayed();
		assertTrue(ResultNotFound,"No such search");
	}
}
