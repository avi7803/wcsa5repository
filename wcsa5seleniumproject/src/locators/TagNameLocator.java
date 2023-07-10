package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   /* driver.get("file:///D:/WCSA5/html%20files/WebComponents.html");
	    driver.findElement(By.tagName("input")).sendKeys("qspiders");*/
	    
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.tagName("input")).sendKeys("qspiders");
	   /* WebElement usn =  driver.findElement(By.tagName("input"));
	    usn.sendKeys("qspiders");*/
	    driver.close();

	}

}
