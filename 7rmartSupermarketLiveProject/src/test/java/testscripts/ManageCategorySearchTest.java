package testscripts;
import org.testng.annotations.Test;
import pages.Login;
import pages.ManageCategorySearch;

public class ManageCategorySearchTest extends Base {
  @Test
  public void manageCategorySearch() 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername("admin");
	  login.enterValidPassword("admin");
	  login.clickLoginbutton();
	  ManageCategorySearch mangSearch=new ManageCategorySearch(driver);
	  mangSearch.clickManageCategory();
	  mangSearch.clicksubCategory();
	  mangSearch.searchSubCategory();
	  mangSearch.selectSubCategoryValueforSearch();
	  String subCategoryvalue="aaaq";
	  mangSearch.enterSubCategoryValue(subCategoryvalue);
	  mangSearch.clickSearchButtonforParticularCategorySeach();	  
	  mangSearch.isCategoryTitleDisplayed();	 
  }
}
