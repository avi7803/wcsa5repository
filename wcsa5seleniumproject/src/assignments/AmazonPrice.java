package assignments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrice {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=4483442313225811247&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-10573980&hydadcr=14453_2316415");
        
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		search.sendKeys("Samsung Mobile");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Samsung Galaxy M14 5G (Berry Blue, 6GB, 128GB Storage) | 50MP Triple Cam | 6000 mAh Battery | 5nm Octa-Core Processor | 12GB RAM with RAM Plus | Android 13 | Without Charger']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='contextualIngressPtPin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']")).sendKeys("411061");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Apply']")).click();
			
		
	}

}
