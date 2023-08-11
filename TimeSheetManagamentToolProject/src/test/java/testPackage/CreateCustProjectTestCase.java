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
import pagePackage.TasksPage;
@Listeners(CustomListener.class)

public class CreateCustProjectTestCase extends BaseTest {
  @Test
  public void createCustomerProject() throws IOException, EncryptedDocumentException, InterruptedException 
  {
	  LoginPage lp = new LoginPage(driver);
	  Flib flib = new Flib();
	  
	  lp.validLogin(flib.readPropertyData(PROP_PATH1, "Username"), flib.readPropertyData(PROP_PATH1, "Password"));
	  
	  HomePage hm = new HomePage(driver);
	  hm.clickOnTasksModule();
	  
	  TasksPage ts = new TasksPage(driver);
	  
	  //Create customer 
	  ts.createNewCustomer(flib.readExcelData(EXCEL_PATH, CUST_PROJSHEETNAME, 1, 0));
	  
	  //Create Project
	  ts.createNewProject(flib.readExcelData(EXCEL_PATH, CUST_PROJSHEETNAME, 1, 0), flib.readExcelData(EXCEL_PATH, CUST_PROJSHEETNAME, 1, 1));
  }
  
  
}
