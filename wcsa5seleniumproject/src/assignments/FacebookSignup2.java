package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup2 {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/signup");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name='reg_email__' and (@class='inputtext _58mg _5dba _2ph-')]")).sendKeys("avinashvpatil0137@gmail.com");
	    driver.findElement(By.xpath("//input[@aria-label='Re-enter email address' and (@class='inputtext _58mg _5dba _2ph-')]")).sendKeys("avinashvpatil0137@gmail.com");
	
	}

}
