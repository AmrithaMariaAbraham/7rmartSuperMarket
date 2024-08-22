package testscripts;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.DashBoard;
import pages.Login;

public class DashBoardTest extends Base
{
  @Test
  public void dashBoardNewfFunctions() throws IOException 
  {
	  Login login=new Login(driver);
	  login.enterValidUsername();
	  login.enterValidPassword();
	  login.clickLoginbutton();
	  DashBoard dashboard=new DashBoard(driver);
	  dashboard.openingDashBoard();
	  dashboard.addingNewAdmintoDashBoard();
	  boolean isDashboardLoaded=dashboard.isAdminUserInformationDisplayed();
	  assertTrue(isDashboardLoaded, "Dashboard not loaded");
	  login.adminLogout();	  
  }
}
