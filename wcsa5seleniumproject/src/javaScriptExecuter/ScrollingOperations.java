package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//https://dashboards.handmadeinteractive.com/jasonlove/

public class ScrollingOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(1000);
		
		jse.executeScript("window.scrollBy(1000,0)");
		
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(-2000,0)");
		
		Thread.sleep(1000);
		driver.navigate().to("https://www.selenium.dev/");
		
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,1000)");

	}

}
