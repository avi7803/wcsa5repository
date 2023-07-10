package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone25Offers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
        driver.get("http://www.bluestone.com/");
        driver.findElement(By.id("denyBtn")).click();//handle the popup
        WebElement target = driver.findElement(By.xpath("//span[@data-p='offers,m']"));
        
        Actions act = new Actions(driver);
        
        act.moveToElement(target).perform();
        
        
	}

}
