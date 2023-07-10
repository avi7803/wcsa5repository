package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogspot {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://omayo.blogspot.com/");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("textarea[id='ta1']")).sendKeys("Avinash");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("textarea[id='ta1']")).clear();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("input[id='radio1']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("input[id='radio2']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("input[id='checkbox2']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("option[id='ironman2']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("option[id='ironman3']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("option[id='ironman4']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("option[id='ironman5']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("option[value='volvox']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("option[value='swiftx']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("option[value='Hyundaix']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("option[value='audix']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("a[id='link1']")).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("input[class='gsc-input']")).sendKeys("selenium");	  
	    Thread.sleep(2000);

	    driver.findElement(By.cssSelector("input[class='gsc-search-button']")).click();	 
	    Thread.sleep(1000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("a[id='b-getorpost']")).click();	 
	    Thread.sleep(1000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    driver.close();
	}

}
