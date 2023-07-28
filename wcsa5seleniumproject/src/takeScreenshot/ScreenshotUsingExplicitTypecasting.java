package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotUsingExplicitTypecasting {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
        driver.get("http://www.google.co.in/");
        
        //Typecasting from WebDriver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        
        File src = ts.getScreenshotAs(OutputType.FILE);
        
        //Path of destination where to copy screenshot taken
        File dest = new File("./screenshots/google2.png");
        
        //Copies the screenshot from source to destination
        Files.copy(src, dest);
        
        driver.close();

	}

}
