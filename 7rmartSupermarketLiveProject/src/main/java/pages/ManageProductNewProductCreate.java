package pages;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageProductNewProductCreate 
{
	WebDriver driver;
	public ManageProductNewProductCreate(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	PageUtility page=new PageUtility();
	WaitUtility Wait=new WaitUtility();
	FileUploadUtility fileupload=new FileUploadUtility();
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[8]") WebElement manageProduct;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement New;
	@FindBy(xpath="//input[@id='title']") WebElement enterTitle;
	@FindBy(xpath="//input[@value='Others']") WebElement productType;
	@FindBy(xpath="//select[@id='cat_id']") WebElement category;
	@FindBy(xpath="//select[@id='sub_id']") WebElement subCategory;	
	@FindBy(xpath="//input[@id='purpose1']") WebElement priceType;
	@FindBy(xpath="//select[@id='p_minimum']") WebElement minimumPiece;
	@FindBy(xpath="//input[@id='p_max']") WebElement maximumQuantity;
	@FindBy(xpath="//input[@id='p_price']")WebElement price;
	@FindBy(xpath="//input[@id='p_stock']") WebElement stock;
	@FindBy(xpath="//input[@id='p_pp']") WebElement purchasePrice;
	@FindBy(xpath="//*[@id='main_img']") WebElement mainImage;
	@FindBy(xpath="//button[@name='create']") WebElement submitButton;	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alert;
	@FindBy(xpath="//a[text()='Home']") WebElement homePage;
	@FindBy(xpath="//button[@name='Search']") WebElement search;
	@FindBy(xpath="//i[@class=' fa fa-search']") WebElement Searchbutton;
	@FindBy(xpath="//input[@name='un']") WebElement title;
	@FindBy(xpath="//input[@name='cd']") WebElement ProductCode;
	@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]") WebElement deleteElement;
	
	public ManageProductNewProductCreate homepageClick()
	{
		homePage.click();
		return this;
	}
	public ManageProductNewProductCreate clickManageProduct()
	{
		manageProduct.click();
		return this;
	}
	public ManageProductNewProductCreate clickNew()
	{
		New.click();
		return this;
	}
	public ManageProductNewProductCreate enterTitleValue(String title) 
	{
		enterTitle.click();		
		System.out.println(title);
		enterTitle.sendKeys(title);
		return this;
	}
	public ManageProductNewProductCreate selectProductType()
	{
		productType.click();
		return this;
	}	
	public ManageProductNewProductCreate selectCategoryFromDropDown()
	{
		//page.selectCategoryFromDropDown(category);
		Select dropdown=new Select(category);
		dropdown.selectByIndex(0);
		return this;
	}
	public ManageProductNewProductCreate selectSubCategoryFromDropDown()
	{
		//page.selectsubCategory(subCategory);
		Select dropdown=new Select(subCategory);
		dropdown.selectByIndex(0);
		return this;
	}	
	public ManageProductNewProductCreate selectPriceType() 
	{
		priceType.click();
		return this;
	}
	public ManageProductNewProductCreate selectMinimumPiece()
	{
		//page.selectMinimumPiece(minimumPiece);
		Select select=new Select(minimumPiece);
		select.selectByIndex(5);
		return this;		
	}
	public ManageProductNewProductCreate enterMaximumQuantity(String qty) 
	{
		maximumQuantity.click();
		System.out.println(qty);
		maximumQuantity.sendKeys(qty);
		//page.scrollDownX380Y380();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(380,380)");
		return this;
	}
	public ManageProductNewProductCreate enterPriceforProduct(String Price) 
	{
		price.click();		
		System.out.println(Price);
		price.sendKeys(Price);
		return this;
	}
	public ManageProductNewProductCreate stockAvailablityforProduct(String Stock) 
	{
		stock.click();		
		stock.sendKeys(Stock);
		//page.scrollDownX1300Y1300();
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(1300,1300)");
		return this;
	}
	public ManageProductNewProductCreate uploadMainImgforProduct() 
	{
		mainImage.click();
		mainImage.sendKeys(Constants.TOMATOIMAGE);
		return this;
	}
	public ManageProductNewProductCreate clickSaveButtonforCreatingNewProduct()
	{
		//Wait.Wait(submitButton);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		submitButton.click();
		return this;
	}
	public ManageProductNewProductCreate clickSearch()//Searching a product
	{
		search.click();
		return this;
	}
	
	public ManageProductNewProductCreate deleteProduct()
	{
		deleteElement.click();
		driver.switchTo().alert().accept();
		return this;
	}
	public ManageNewsNew SearchdeletedProduct(String TitLe, String productcode) 
	{
		//title.sendKeys(Title);
		title.sendKeys(TitLe);
		ProductCode.sendKeys(productcode);
		//ProductCode.sendKeys(productCode);
		Searchbutton.click();
		return new ManageNewsNew(driver);
	}	
	public boolean isalertdisplayed()
	{
		return alert.isDisplayed();
	}	
}
