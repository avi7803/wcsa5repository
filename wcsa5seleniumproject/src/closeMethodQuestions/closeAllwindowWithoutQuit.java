package closeMethodQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeAllwindowWithoutQuit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("https://omayo.blogspot.com");
		   
		   String parentHandle = driver.getWindowHandle();
		   System.out.println("Address of Parent Window : " + parentHandle);
		   
		   driver.findElement(By.partialLinkText("Open a popup window")).click();
		   String childHandle = driver.getWindowHandle();
		   Thread.sleep(2000);
		   System.out.println("Address of Child Window : " + childHandle);
		   
		   driver.switchTo().window(childHandle);
		   driver.close();
		   Thread.sleep(2000);
		   //driver.switchTo().window(parentHandle);
		   driver.close();
		   
		   


	}

}
