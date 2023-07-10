package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		   
		 //Maximize the browser window
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.omayo.blogspot.com/");
		 
		 driver.findElement(By.linkText("SeleniumTutorial")).click();
		//Provide the delay of 2 seconds.
		   Thread.sleep(3000);
	       //To close the Browser
		   driver.close();
	}

}
