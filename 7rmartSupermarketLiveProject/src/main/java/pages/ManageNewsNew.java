package pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsNew 
{
	WebDriver driver;
	public ManageNewsNew(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[9]") WebElement manageNews;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement New;
	@FindBy(xpath="//textarea[@id='news']") WebElement enterNews; 
	@FindBy(xpath="//button[@name='create']") WebElement saveButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	
	public ManageNewsNew clickManageNews()
	{
		manageNews.click();
		return this;
	}
	public ManageNewsNew clickNewButton()
	{
		New.click();
		return this;
	}
	public ManageNewsNew enterValueforNews(String News) throws IOException
	{
		enterNews.click();		
		enterNews.sendKeys(News);
		return this;
	}
	public ManageProductNewProductCreate clickSaveButton()
	{
		saveButton.click();
		return new ManageProductNewProductCreate(driver);
	}
	public boolean isAlertdisplayed()
	{
		return alert.isDisplayed();
	}
}
