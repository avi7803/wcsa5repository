package keywordDrivenFramework;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InvalidLoginTestCase_keyWordDriven extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib= new Flib();
		
		int rc = flib.getLastRowCount(EXCEL_PATH, "invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			WebElement usernameTextBox = driver.findElement(By.name("username"));
			usernameTextBox.sendKeys(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
			Thread.sleep(1000);
			driver.findElement(By.id("loginButton")).click();
			usernameTextBox.clear();
		}
		bt.closeBrowser();

	}

}
