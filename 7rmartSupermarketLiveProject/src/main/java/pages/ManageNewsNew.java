package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageNewsNew 
{
	WebDriver driver;
	public ManageNewsNew(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	WaitUtility Wait=new WaitUtility();
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[9]") WebElement manageNews;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement New;
	@FindBy(xpath="//textarea[@id='news']") WebElement enterNews; 
	@FindBy(xpath="//button[text()='Save']") WebElement saveButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	public void clickManageNews()
	{
		manageNews.click();
	}
	public void clickNewButton()
	{
		New.click();
	}
	public void enterValueforNews(String news)
	{
		enterNews.sendKeys(news);
	}
	public void clickSaveButton()
	{
		Wait.Wait(saveButton);
		saveButton.click();
	}
	public boolean isAlertdisplayed()
	{
		return alert.isDisplayed();
	}
}
