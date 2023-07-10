package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("http://desktop-spnu1hq/login.do");
	    //System.out.println(driver.findElement(By.id("loginButton")).getText()); 
	    
	    WebElement loginButton = driver.findElement(By.id("loginButton"));
	    System.out.println(loginButton.getText());
	    
	    
        //driver.close();
	}

}
