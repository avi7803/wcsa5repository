package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomListener.class)

public class ValidLoginTestCase extends BaseTest{
	
	  
	  
  @Test
  public void validLoginMethod() throws IOException 
  {
	  LoginPage lp = new LoginPage(driver);
	  Flib flib = new Flib();
	  lp.validLogin(flib.readPropertyData(PROP_PATH1, "Username"), flib.readPropertyData(PROP_PATH1, "Password"));;
  }
  
  @Test(dependsOnMethods = "validLoginMethod")
  public void invalidLoginMethod() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  LoginPage lp = new LoginPage(driver);
	  Flib flib = new Flib();
	  int rc = flib.getLastRowCount(EXCEL_PATH, INVALID_SHEETNAME);
	  for(int i=1;i<=rc;i++)
	  {
		  lp.inValidLogin(flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i, 0), flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i,1));
	  }
  }
}
