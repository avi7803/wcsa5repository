package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Relative path of WebDriver.exe
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		// Upcast into WebDriver (Interface)
	   WebDriver driver = new FirefoxDriver();
	   
	 //Maximize the browser window
	 driver.manage().window().maximize();
	 //Provide the delay of 2 seconds.
	   Thread.sleep(2000);
       //To close the Browser
	   driver.close();
	}

}
