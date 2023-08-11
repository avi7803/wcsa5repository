package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UserPage;
@Listeners(CustomListener.class)

public class CreateUserTestCase extends BaseTest{
  @Test
  public void createUserMethod() throws IOException, EncryptedDocumentException, InterruptedException 
  {
	  LoginPage lp = new LoginPage(driver); 
	  Flib flib = new Flib();
	  
	  lp.validLogin(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
	  
	  HomePage hm = new HomePage(driver);
	  
	  hm.clickOnUsersModule();
	  
	  UserPage us = new UserPage(driver);
	  //Create Manager
	  us.createManager(flib.readExcelData(EXCEL_PATH, MANAGER_SHEETNAME, 1, 0),flib.readExcelData(EXCEL_PATH, MANAGER_SHEETNAME, 1, 1) , flib.readExcelData(EXCEL_PATH, MANAGER_SHEETNAME, 1, 2), flib.readExcelData(EXCEL_PATH, MANAGER_SHEETNAME, 1, 3));
  
	  //Logout
	  hm.clickOnLogoutLink();
  }
}
