package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDowncasting {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		// By Downcasting to RemoteWebdriver
		
		RemoteWebDriver rs =(RemoteWebDriver) driver;
		
		
		File src = rs.getScreenshotAs(OutputType.FILE);
		
		//Path of destination where to copy screenshot taken
		File dest = new  File("./screenshots/amazon.png");
		
		//Copies the screenshot from source to destination
		Files.copy(src, dest);
		
		driver.close();

	}

}
