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
import pagePackage.UserPage;
@Listeners(CustomListener.class)
public class CreateTaskTestCase extends BaseTest {
	
  @Test
  public void createTaskMethod() throws IOException, EncryptedDocumentException, InterruptedException 
  {
	  LoginPage lp = new LoginPage(driver);
	  Flib flib = new Flib();
	  HomePage hm = new HomePage(driver);
	  TasksPage ts = new TasksPage(driver);
	  UserPage us =new UserPage(driver);
	  
	  lp.validLogin(flib.readPropertyData(PROP_PATH1, "Username"), flib.readPropertyData(PROP_PATH1, "Password"));
	  
	  
	  
	  //Click on Tasks page
	  hm.clickOnTasksModule();
	  
	  //To create New Task
	  ts.createNewTask(flib.readExcelData(EXCEL_PATH, CUST_PROJSHEETNAME, 1, 0), flib.readExcelData(EXCEL_PATH, CUST_PROJSHEETNAME, 1, 1), flib.readExcelData(EXCEL_PATH, TASK_SHEETNAME, 1, 0),flib.readExcelData(EXCEL_PATH, TASK_SHEETNAME, 1, 1), flib.readExcelData(EXCEL_PATH, TASK_SHEETNAME, 1, 2));
  
	  //To click on Users Module
	  hm.clickOnUsersModule();
	  
	  //To create New Test Engineer
	  us.createTestEngineer(flib.readExcelData(EXCEL_PATH, TEST_ENGSHEETNAME, 1, 0),flib.readExcelData(EXCEL_PATH, TEST_ENGSHEETNAME, 1, 1), flib.readExcelData(EXCEL_PATH, TEST_ENGSHEETNAME, 1, 2), flib.readExcelData(EXCEL_PATH, TEST_ENGSHEETNAME, 1, 3));
	  
	  
  }
}
