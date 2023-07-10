package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //To maximize the browser window
		driver.get("https://www.google.co.in"); // To go to the  "google.com" site
		
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);//keys.Enter--> To click the "Enter" key after filling "selenium" in search box
		
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
	}
	

}
