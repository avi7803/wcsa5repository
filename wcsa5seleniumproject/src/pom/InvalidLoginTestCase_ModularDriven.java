package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;


public class InvalidLoginTestCase_ModularDriven extends BaseTest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setup();//To open Browser
		
		Flib flib =new Flib();
		
		//get last row count 
		int rc = flib.getLastRowCount(EXCEL_PATH, "invalidcreds");
		
		LoginPage lp = new LoginPage(driver);
		
	 for(int i=1;i<=rc;i++)
	 {
		 //to do invalid login call invalidLogin method of LoginPage
		lp.inValidLogin(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0) , flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
	 }

	 bt.tearDown();
	}

}
