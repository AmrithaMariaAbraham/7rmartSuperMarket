package testscripts;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;
import org.testng.annotations.Test;
import constants.Constants;
import pages.AdminUsers;
import pages.Login;
import pages.ManageCategoryNew;
import pages.ManageContact;
import pages.ManageFooter;
import pages.ManageNewsNew;
import pages.ManageProductNewProductCreate;
import utilities.ExcelUtility;

public class ManageNewsTestNew extends Base
{
	public Login login;
	public AdminUsers adminUsers;
	public ManageCategoryNew manageCategoryNew;
	public ManageContact manageContact;
	public ManageFooter manageFooter;
	public ManageNewsNew manageNewsNew;
	public ManageProductNewProductCreate manageProductNewproduct;
	
  @Test
  public void manageNews() throws IOException, InterruptedException, AWTException 
  {
	  String useramefield=ExcelUtility.getStringData(1,0,"LoginDetails");
	  String passwordfield=ExcelUtility.getStringData(1,1,"LoginDetails");
	  login=new Login(driver);
	  String address=ExcelUtility.getStringData(1,0,"ManageFooter");
	  String EMail=ExcelUtility.getStringData(1,1,"ManageFooter");
	  String Phone=ExcelUtility.getIntegerData(1,2,"ManageFooter");
	  String phone=ExcelUtility.getIntegerData(1,0,"ManageContact");
	  String email=ExcelUtility.getStringData(1,1,"ManageContact");
	  String Address=ExcelUtility.getStringData(1,2,"ManageContact");
	  String time=ExcelUtility.getIntegerData(1,3,"ManageContact");
	  String deliveryCharge=ExcelUtility.getIntegerData(1,4,"ManageContact");
	  String username=ExcelUtility.getStringData(1,0,"AdminUsers");
	  String Password=ExcelUtility.getStringData(1,1,"AdminUsers");
	  String CateValue=ExcelUtility.getStringData(1,0,"ManageCategoryNew");
	  String News=ExcelUtility.getStringData(1,0,"ManageNewsNew");
	  String TitLe=ExcelUtility.getStringData(1,0,"ManageProductSearch");
	  String productcode=ExcelUtility.getStringData(1,1,"ManageProductSearch");
	  String title=ExcelUtility.getStringData(1,0,"ManageProductNew");
	  String qty=ExcelUtility.getIntegerData(1,1,"ManageProductNew");
	  String Price=ExcelUtility.getIntegerData(1,2,"ManageProductNew");
	  String Stock=ExcelUtility.getIntegerData(1,3,"ManageProductNew");	 
	  adminUsers=login.enterValidUsername(useramefield).enterValidPassword(passwordfield).clickLoginbutton().clickAdminUsers().clickNew().enterUsername(username).enterPassword(Password).selectUserTypeFromDropdown().clickSaveButton().selectSearchButton();
	  manageCategoryNew=adminUsers.deleteSearchedValue();
	  manageContact=manageCategoryNew.hompageclick().clickCategory().clickAddButton().enterCategoryValue(CateValue).selectAValuefromSelectGroup().clickSaveButton();
	  manageFooter=manageContact.homepageClick().clickManageContact().clickEditButton().enterPhonenumber(phone).editEmail(email).editAddress(Address).editdeliverytime(time).editDeliveryChargeLimit(deliveryCharge).clickUpdateButton();
	  manageProductNewproduct=manageFooter.hompepageclick().clickManageFooterText().editFooterTextValue().editAddress(address).editEmail(EMail).editPhoneNumber(Phone).clickUpdateButton();
	  manageNewsNew=manageProductNewproduct.homepageClick().clickManageProduct().clickNew().enterTitleValue(title).selectCategoryFromDropDown().selectSubCategoryFromDropDown().selectPriceType().selectMinimumPiece().enterMaximumQuantity(qty).enterPriceforProduct(Price).stockAvailablityforProduct(Stock).clickSaveButtonforCreatingNewProduct().homepageClick().clickManageProduct().deleteProduct().SearchdeletedProduct(TitLe, productcode).homepageClick().clickManageNews().clickNewButton().enterValueforNews(News).clickSaveButton();
	  boolean isSuccessAlertdisplayed= manageNewsNew.isAlertdisplayed();
	  assertTrue(isSuccessAlertdisplayed,Constants.ERRORFORMANAGENEWSNEW);
  }
}
