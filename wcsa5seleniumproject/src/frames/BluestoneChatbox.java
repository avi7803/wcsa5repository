package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneChatbox {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//lauch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.bluestone.com/");
		Thread.sleep(1000);
        driver.findElement(By.id("denyBtn")).click();//handle the popup
        
        //identify the chatbox
        WebElement chatBox = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
        
        Thread.sleep(2000);
        //swith control to Webpage which present chatBox
        driver.switchTo().frame(chatBox); // transfer control using WEBELEMENT
        
       // driver.switchTo().frame(6); -> transfer control using INDEX
       // driver.switchTo().frame("fc_widget"); -> transfer control using ID
        Thread.sleep(2000);
        
        //Click on ChatBox
        driver.findElement(By.id("chat-icon")).click();
         
       //  JavascriptExecutor jse = (JavascriptExecutor)driver;
         
        // jse.executeScript("arguments[0].click();", w);
        
        //Transfer control back to Main Webpage to enter details in chatBox
        driver.switchTo().defaultContent();
        
        driver.findElement(By.id("chat-fc-name")).sendKeys("Avinash");
        Thread.sleep(1000);
        driver.findElement(By.id("chat-fc-email")).sendKeys("avipatil7803@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("chat-fc-phone")).sendKeys("9146452426");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
	}

}
