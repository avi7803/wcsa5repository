package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); //TO open Chrome browser
	    
	    driver.manage().window().maximize();  //To maximize the window
	    driver.get("https://www.instagram.com/"); // To open instagram site
	   // Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Avinash"); //To enter data in Username textfield
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("avinash123"); //To enter data in Password textfield
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Log in']")).click(); // To click on Login button
	}

}
