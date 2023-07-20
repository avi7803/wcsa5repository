package pom;

import java.io.IOException;

public class ValidLoginTestCase_ModularDriven extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.setup();
		
		Flib flib = new Flib();
		
		//To call the WebElements of login page to create object of loginPage class
		LoginPage lp= new LoginPage(driver);
		
		String validUsername = flib.readPropertyData(PROP_PATH, "Username");
		String validPassword = flib.readPropertyData(PROP_PATH, "Password");
		lp.validLogin(validUsername, validPassword);

		//OR
		/*
		 lp.validLogin(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password")); */
		
		HomePage home = new HomePage(driver);
		
		home.clickOnLogoutLink();
		
		
		
	}

}
