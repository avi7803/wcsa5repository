package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledDisabledWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		driver.get("file:///D:/WCSA5/html%20files/DisabledElement.html");
		
		//identify WebElement
		driver.findElement(By.id("i1")).sendKeys("admin");
		
		Thread.sleep(2000);
		//To handle Disabled WebElement
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//Generate alert popup
		jse.executeScript("alert('Hello there!!');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//handled Disabled WebElement
		jse.executeScript("document.getElementById('i2').value='manager'");
		Thread.sleep(2000);
		driver.close();
	}

}
