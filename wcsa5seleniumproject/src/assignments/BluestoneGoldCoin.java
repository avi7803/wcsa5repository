package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneGoldCoin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
        driver.get("http://www.bluestone.com/");
        driver.findElement(By.id("denyBtn")).click();//handle the popup
        
       // Thread.sleep(2000);
        
        WebElement target =driver.findElement(By.xpath("//a[text()='Coins '"));
        driver.findElement(By.xpath("//span[text()='1 gram' and (@data-p='l-gold-coins-weight-1gms,m')]")).click();
        WebElement coin = driver.findElement(By.id("5920"));
        Actions act = new Actions(driver);
      
        act.moveToElement(target).perform();
        
        if(coin.isDisplayed()== true) {
			
		} else {

		}
        //driver.close();
	}

}
