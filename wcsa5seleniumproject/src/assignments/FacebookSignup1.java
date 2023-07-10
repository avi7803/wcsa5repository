package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Avinash");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");
        Thread.sleep(2000);
        driver.close();
	}

}
