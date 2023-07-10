package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Relative path of WebDriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Upcast into WebDriver (Interface)
		WebDriver driver =  new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		//Provide the delay of 2 seconds.
		Thread.sleep(2000);
		//To close the browser
		driver.close();
	}

}
