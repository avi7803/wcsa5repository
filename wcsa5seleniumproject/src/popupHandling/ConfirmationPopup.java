package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		 
		 WebDriver driver = new EdgeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("file:///D:/WCSA5/html%20files/confirmation.html");
		 
		 driver.findElement(By.xpath("//button[text()='Generate Confirmation Popup']")).click();
		 
		 Thread.sleep(2000);
		 
		 //To handle confirmation Popup
		 Alert al = driver.switchTo().alert();
		 al.accept();

	}

}
