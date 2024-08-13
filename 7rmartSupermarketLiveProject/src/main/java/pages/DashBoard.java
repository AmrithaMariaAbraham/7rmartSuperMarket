package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard
{
	WebDriver driver;
	public DashBoard(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'] ") WebElement dashBoard;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement New;
	@FindBy(xpath="//h3[text()='Admin Users Informations']") WebElement adminInfoDisplayed;
	
	public void openingDashBoard()
	{
		dashBoard.click();
	}
	public void addingNewAdmintoDashBoard()
	{
		New.click();
	}
	public boolean isAdminUserInformationDisplayed()
	{
		return adminInfoDisplayed.isDisplayed();
	}
}
