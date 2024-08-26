package testscripts;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.DashBoard;
import pages.Login;
import utilities.ExcelUtility;

public class DashBoardTest extends Base
{
  @Test
  public void dashBoardNewfFunctions() throws IOException 
  { 
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  Login login=new Login(driver);
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();
	  DashBoard dashboard=new DashBoard(driver);
	  dashboard.openingDashBoard();
	  dashboard.addingNewAdmintoDashBoard();
	  boolean isDashboardLoaded=dashboard.isAdminUserInformationDisplayed();
	  assertTrue(isDashboardLoaded, "Dashboard not loaded");
	  login.adminLogout();	  
  }
}
