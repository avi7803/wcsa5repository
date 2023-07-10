
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJetLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.spicejet.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[text()='Login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9146452426");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("avi@7803");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@data-testid='login-submit-btn']")).click();
        Thread.sleep(2000);
	}

}
