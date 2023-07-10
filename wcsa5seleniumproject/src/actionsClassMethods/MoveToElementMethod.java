package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) throws InterruptedException {
		//Use to perform mouse over action
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
        driver.get("http://www.bluestone.com/");//launch the bluestone application
        driver.findElement(By.id("denyBtn")).click();//handle the popup
        
        Thread.sleep(2000);
        WebElement target =driver.findElement(By.xpath("//a[contains(text(),'Watch)]"));
        
        //to perform mouse actions on webelement
        Actions act = new Actions(driver);
        
        //to perform mouse over action
        act.moveToElement(target).perform();
        
        driver.findElement(By.xpath("//a[.='Band']")).click();
	}

}
