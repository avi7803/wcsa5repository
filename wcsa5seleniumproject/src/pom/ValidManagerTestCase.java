package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ValidManagerTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setup();
		
		Flib flib = new Flib();
		HomePage home = new HomePage(driver);
		CreateUsersPage cr = new CreateUsersPage(driver);
		WorkLib worklib = new WorkLib();
		
		//To call the WebElements of login page to create object of loginPage class
		LoginPage lp= new LoginPage(driver);
		
		String validUsername = flib.readPropertyData(PROP_PATH, "Username");
		String validPassword = flib.readPropertyData(PROP_PATH, "Password");
		lp.validLogin(validUsername, validPassword);
		
		//Click on Users Module
		home.clickOnUsersModule();
		
		//Create Manager
		cr.UserData(flib.readExcelData(EXCEL_PATH, "managercreds", 1, 0),flib.readExcelData(EXCEL_PATH, "managercreds", 1, 1) , flib.readExcelData(EXCEL_PATH, "managercreds", 1, 2), flib.readExcelData(EXCEL_PATH, "managercreds", 1, 3));

		
		// Delete User
		cr.deleteManager();
		worklib.handleConfirmationPopup();
				
		Thread.sleep(2000);
		bt.tearDown();
		
	}

}
