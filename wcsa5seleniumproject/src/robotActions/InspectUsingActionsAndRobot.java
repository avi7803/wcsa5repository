package robotActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InspectUsingActionsAndRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		driver.get("https://www.selenium.dev/"); //Goto selenium site
		   
		 //Identify the 'Downloads' button
		   WebElement target = driver.findElement(By.xpath("//span[text()='Downloads']"));
		   
		   //Creation of object of Actions class
		   Actions act = new Actions(driver);
		   
		   //To do Right click on Downloads
		   act.contextClick(target).perform();
		   
		   Thread.sleep(1000);
		   
		 //Creation of object of Robot class
		   Robot robot = new Robot();
		   
		   for(int i=1 ; i<=6;i++)// For loop for pressing the Page Down key  6 times
		   {
			   robot.keyPress(KeyEvent.VK_PAGE_DOWN);    //To press the Page Down key on keyboard
			   robot.keyRelease(KeyEvent.VK_PAGE_DOWN); //To release the Page Down key on keyboard
			   Thread.sleep(1000);
		   }
		  
		   Thread.sleep(1000);
		   robot.keyPress(KeyEvent.VK_ENTER);  //To press the Enter key on keyboard

	}

}
