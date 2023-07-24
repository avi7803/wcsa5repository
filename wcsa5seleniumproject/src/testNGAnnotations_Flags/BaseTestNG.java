package testNGAnnotations_Flags;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTestNG {
	static WebDriver driver;
  @BeforeMethod
  public void setUp()
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com/");
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
}
