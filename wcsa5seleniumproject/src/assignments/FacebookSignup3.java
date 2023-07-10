package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/signup");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//option[contains(@value,3)]")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//option[contains(text(),'Aug')]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//option[contains(text(),'1998')]")).click();
	    Thread.sleep(1000);
        driver.close();
	}

}   
