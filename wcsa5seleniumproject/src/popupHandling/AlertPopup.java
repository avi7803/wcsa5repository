package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class AlertPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		 System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		 
		 WebDriver driver = new EdgeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("D:\\WCSA5\\html files/alert.html");
		 
		 //To generate popup click on button
		 driver.findElement(By.xpath("//button[text()='Generate Alert']")).click();
		 
		 Robot robot = new Robot();
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 
		 //handle alert popup by swithTo()
		 Alert al = driver.switchTo().alert();
		 Thread.sleep(2000);
		 
		 al.accept(); //For accepting alert popup
		 //al.dismiss();//For dismiss alert popup
		 System.out.println(al.getText());
		 //driver.close();

	}

}
