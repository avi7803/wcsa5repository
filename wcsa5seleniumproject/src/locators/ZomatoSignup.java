package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.zomato.com/india");
	    
	    driver.findElement(By.linkText("Sign up")).click();
	    
	    driver.findElement(By.cssSelector("input[class*='sc-1yzxt5f-9 dFkpnp']")).sendKeys("qspiders");
	    /*driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("Avinash");
	    driver.findElement(By.className("sc-1yzxt5f-9 bbrwhB")).sendKeys("avinashvpatil0137@gmail.com");*/
	    
	}

}
 