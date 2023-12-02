package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TimeTrackPage;

public class TestEngTastPerformTestCase extends BaseTest {
  @Test
  public void TaskPerfomed() throws EncryptedDocumentException, IOException {
	  LoginPage lp = new LoginPage(driver);
	  Flib flib = new Flib();
	  HomePage hm = new HomePage(driver);
	 // TasksPage ts = new TasksPage(driver);
	  //UserPage us =new UserPage(driver);
	  TimeTrackPage tt = new TimeTrackPage(driver);
	  
	  lp.validLogin(flib.readExcelData(EXCEL_PATH, TEST_ENGSHEETNAME, 1, 0),flib.readExcelData(EXCEL_PATH, TEST_ENGSHEETNAME, 1, 1));
  
	  
  
  
  }
}
