package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageSubCategoryNew 
{
	WebDriver driver;
	public ManageSubCategoryNew(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-list-alt']") WebElement ManageCategory;
	@FindBy(xpath="//p[text()='Sub Category']") WebElement subCategory;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement NewSubCategory;
	@FindBy(xpath="//input[@name='ut']") WebElement subCategoryInputValue;	
	@FindBy(xpath="//button[@type='submit']") WebElement searchButtonClick;	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']") WebElement subCategorytitle;
	
	
	
	

}
