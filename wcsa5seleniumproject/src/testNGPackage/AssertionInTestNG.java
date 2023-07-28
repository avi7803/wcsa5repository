package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {
  @Test
  public void assertionMethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("http://avinash-patil/login.do");
	  
	  //Store the title of the Login page in one variable
	  String actualTitle = driver.getTitle();
	  
	  
	  //Soft Assertion
	  SoftAssert sa = new SoftAssert();
	  
	  //Compare stored title of login page with title of the page we got after going to the given URL automatically 
	  sa.assertEquals(driver.getTitle(), actualTitle);
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  System.out.println("Title matched. Test case Passed!!!");
	  
	  //The assertAll() method is called to throw all the exceptions caught during the process of Selenium test automation execution. 
	  sa.assertAll();
	  
	//===========================================================================================  
	  //Hard Assertion
	//Store the title of the Home page in one variable
	  String homeActualTitle = driver.getTitle();
	  
	//Compare stored title Home page with title of the  page we got after login successfully using Assert class
	 Assert.assertEquals(driver.getTitle(), homeActualTitle);
	 
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("Logout")).click(); 
	  
  }
}
