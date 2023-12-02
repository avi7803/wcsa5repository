package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TimeTrackPage;

public class AssignTaskTestCase extends BaseTest{
  @Test
  public void AssignTask() throws EncryptedDocumentException, InterruptedException, IOException {
	  
	  LoginPage lp = new LoginPage(driver);
	  Flib flib = new Flib();
	  HomePage hm = new HomePage(driver);
	  TimeTrackPage tt = new TimeTrackPage(driver);
	  
	  lp.validLogin(flib.readExcelData(EXCEL_PATH, MANAGER_SHEETNAME, 1, 0),flib.readExcelData(EXCEL_PATH, MANAGER_SHEETNAME, 1, 1));
	  
	  tt.AssignTask(flib.readExcelData(EXCEL_PATH, TEST_ENGSHEETNAME, 1, 3));
	  Thread.sleep(1000);
	  hm.clickOnLogoutLink();
  }
}
