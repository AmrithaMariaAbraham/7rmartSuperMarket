package testscripts;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.DashBoard;
import pages.Login;

public class DashBoardTest extends Base
{
  @Test
  public void dashBoardNewfFunctions() 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername("admin");
	  login.enterValidPassword("admin");
	  login.clickLoginbutton();
	  DashBoard dashboard=new DashBoard(driver);
	  dashboard.openingDashBoard();
	  dashboard.addingNewAdmintoDashBoard();
	  boolean isDashboardLoaded=dashboard.isAdminUserInformationDisplayed();
	  assertTrue(isDashboardLoaded, "Dashboard not loaded");
	  login.adminLogout();	  
  }
}
