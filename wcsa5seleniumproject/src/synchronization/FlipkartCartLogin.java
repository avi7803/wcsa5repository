package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCartLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	   // Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[text()='✕']")).click();  // handle Popup
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Cart']")).click(); //Click on Cart
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//span[text()='Login']")).click();  //click on Login button
	    Thread.sleep(5000);
	  
	}

}
