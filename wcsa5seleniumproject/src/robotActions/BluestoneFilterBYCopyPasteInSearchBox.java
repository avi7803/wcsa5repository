package robotActions;

import java.time.Duration;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneFilterBYCopyPasteInSearchBox {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		driver.get("https://www.bluestone.com/"); //Goto Bluestone site
		driver.findElement(By.id("denyBtn")).click();//handle the Popup
		
		 //to perform mouse actions on webElement
        Actions act = new Actions(driver);
		//Identify Watch Jewellery button
		WebElement target = driver.findElement(By.xpath("//a[@title='Watch Jewellery'] "));
		
		//to perform mouse over action
        act.moveToElement(target).perform();
        
        Thread.sleep(1000);
        //Click on Band option
        driver.findElement(By.xpath("//a[.='Band']")).click();
        Thread.sleep(4000);
        WebElement filterBy = driver.findElement(By.xpath("//div[text()='Filter by']"));
        
        for (int i = 0; i <=2; i++) {
			act.doubleClick(filterBy).perform();
			act.clickAndHold(filterBy).perform();
		}
        Thread.sleep(4000);
        
        //Copy the Filter By text
        Robot robot = new Robot();
        
        //To press the Control and C key on keyboard
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        
       //To release the Control and C key on keyboard
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        
       //Identify search box
       driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search'] ")).click();
       
       //Paste the Filter By text
       robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_V);
       
       robot.keyRelease(KeyEvent.VK_CONTROL);
       robot.keyRelease(KeyEvent.VK_V);
       
       //Press Enter button
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
       
       
       //Verify 1 design is Displayed or not
       if (driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed()) 
       {
    	   Thread.sleep(2000);
    	   System.out.println("Successful!!");
    	   driver.quit();
		
	   } 
       else 
       {
    	   System.out.println("Exception!!");

	   }
       
       
	}

}
