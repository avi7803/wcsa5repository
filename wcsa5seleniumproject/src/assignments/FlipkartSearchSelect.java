package assignments;

import java.time.Duration;
//import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearchSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(1000);
	    WebElement searchTB = driver.findElement(By.xpath("//input[@class='_3704LK']"));
	    searchTB.sendKeys("HP Laptops");
	    Thread.sleep(2000);
	    searchTB.sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[(text()='Brand')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i7'")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP'")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='windows 11'")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='4* & above']")).click();
	    Thread.sleep(3000);
	    List<WebElement> laptop =  driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	    List<WebElement> priceOfLaptop = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	    
	    for (int i = 0; i < laptop.size(); i++) {
			String op = laptop.get(i).getText();
			for(int j=i;j<=i;j++)
			{
				String ops = priceOfLaptop.get(i).getText();
				System.out.println(op + " "+ ops);
				Thread.sleep(2000);
			}
			System.out.println();
		}
	    
	    driver.close();
	}

}
