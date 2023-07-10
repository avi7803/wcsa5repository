package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
        driver.get("http://www.instagram.com/");
	    
	    driver.findElement(By.name("username")).sendKeys("sdsdfsdfsdf");
	    driver.findElement(By.name("password")).sendKeys("sdfsd54654");
        WebElement loginButton=driver.findElement(By.xpath("//button[contains(@class,'_acap')]"));
        loginButton.submit();
        
        Thread.sleep(2000);
        driver.navigate().to("http://desktop-spnu1hq/login.do");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        WebElement loginButton2 = driver.findElement(By.id("loginButton"));
         
        //loginButton2.submit();
        loginButton2.click();

	}

}
