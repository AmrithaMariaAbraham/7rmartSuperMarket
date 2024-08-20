package pages;
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
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[10]") WebElement clickManageProd;
	@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]") WebElement deleteElement;
	@FindBy(xpath="//i[@class=' fa fa-search']") WebElement Searchbutton;
	@FindBy(xpath="//input[@name='un']") WebElement title;
	@FindBy(xpath="//button[@name='Search']") WebElement searchElement;
	@FindBy(xpath="//input[@name='cd']") WebElement ProductCode;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement Alert;
	@FindBy(xpath="//span[@id='res']") WebElement elementNotFound;
	public void clickmanageProduct()
	{
		clickManageProd.click();
	}
	public void deleteProduct()
	{
		deleteElement.click();
		driver.switchTo().alert().accept();
	}
	public void clickSearchButton()
	{
		Searchbutton.click();
	}
	public void search()
	{
		searchElement.click();
	}
	public void SearcheletedProduct(String Title,String productCode)
	{
		title.sendKeys(Title);
		ProductCode.sendKeys(productCode);
		Searchbutton.click();
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
