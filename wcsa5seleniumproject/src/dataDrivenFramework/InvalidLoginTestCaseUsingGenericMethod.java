package dataDrivenFramework;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class InvalidLoginTestCaseUsingGenericMethod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-gb4g7vd/login.do");

		// read the data from excel file and test the login page
		Flib flib = new Flib();  
		
		int rc = flib.getLastRowCount("invalidcreds");
		// to read multiple data use for loop
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds",i,0);
			String invalidPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds",i,1);


			driver.findElement(By.name("username")).sendKeys(invalidUsername);
			Thread.sleep(500);
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			
		}
	}
}
