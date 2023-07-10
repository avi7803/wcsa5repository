package robotActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Robot1PrintingPage {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("https://www.wikipedia.com");
           //driver.findElement(By.xpath("//button[text()='✕']")).click();
           
           Thread.sleep(2000);
           //generate print popup
           Robot robot = new Robot();
           
           //press the keys
           robot.keyPress(KeyEvent.VK_CONTROL);
           robot.keyPress(KeyEvent.VK_P);
           
           //Thread.sleep(2000);
           //release the keys
           robot.keyRelease(KeyEvent.VK_CONTROL);
           robot.keyRelease(KeyEvent.VK_P);
           
           Thread.sleep(2000);
           
          //press tab
           robot.keyPress(KeyEvent.VK_TAB);
           robot.keyRelease(KeyEvent.VK_TAB);
           
           Thread.sleep(2000);
           robot.keyPress(KeyEvent.VK_ENTER);
           robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
