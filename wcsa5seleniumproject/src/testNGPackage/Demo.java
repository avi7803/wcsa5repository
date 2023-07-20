package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	//  System.out.println("This is Demo TestNG Class!!");
	  
		//  Reporter.log("This is Demo TestNG Class!!");
		  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://www.selenium.dev/");
	    
		  Reporter.log("This is Demo TestNG Class!!",true);
  }
}
