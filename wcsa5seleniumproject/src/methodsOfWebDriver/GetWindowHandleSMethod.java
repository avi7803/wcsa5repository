package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleSMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("https://omayo.blogspot.com");
		   
		   String parentHandle = driver.getWindowHandle();
		   System.out.println("Address of Parent Window : " + parentHandle);
		   
		   driver.findElement(By.partialLinkText("Open a popup window")).click();
		   Thread.sleep(2000);
		   
		   Set<String> allHandles= driver.getWindowHandles();
		   for (String wh : allHandles) {
			   System.out.println("Address of Child Window : " + allHandles);
		}
		   
		   
		  // driver.quit();
	}

}
