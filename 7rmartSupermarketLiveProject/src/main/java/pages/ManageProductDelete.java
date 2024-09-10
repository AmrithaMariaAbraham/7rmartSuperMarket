package pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProductDelete 
{
	WebDriver driver;
	public ManageProductDelete(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[8]") WebElement clickManageProd;
	@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]") WebElement deleteElement;
	@FindBy(xpath="//i[@class=' fa fa-search']") WebElement Searchbutton;
	@FindBy(xpath="//input[@name='un']") WebElement title;
	@FindBy(xpath="//button[@name='Search']") WebElement searchElement;
	@FindBy(xpath="//input[@name='cd']") WebElement ProductCode;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement Alert;
	@FindBy(xpath="//span[@id='res']") WebElement elementNotFound;
	
	public ManageProductDelete clickmanageProduct()
	{
		clickManageProd.click();
		return this;
	}
	public ManageProductDelete deleteProduct()
	{
		deleteElement.click();
		driver.switchTo().alert().accept();
		return this;
	}
	public ManageProductDelete clickSearchButton()
	{
		Searchbutton.click();
		return this;
	}
	public ManageProductDelete search()
	{
		searchElement.click();
		return this;
	}
	public ManageProductDelete SearchdeletedProduct(String TitLe, String productcode) throws IOException
	{
		//title.sendKeys(Title);
		title.sendKeys(TitLe);
		ProductCode.sendKeys(productcode);
		//ProductCode.sendKeys(productCode);
		Searchbutton.click();
		return this;
	}	
	public boolean isTitledisplayed()
	{
	  return Alert.isDisplayed();
	}
	public boolean iselementdisplayed()
	{
		return elementNotFound.isDisplayed();
	}
}
