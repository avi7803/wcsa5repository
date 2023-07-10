package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolymorphism {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Which browser we want to open!!");
		String browserValue = sc.next();

		if (browserValue.equalsIgnoreCase("Chrome")) 
		{
			//Relative path of WebDriver.exe
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//Upcast into WebDriver (Interface)
			 driver =  new ChromeDriver();
			//Maximize the browser window
			driver.manage().window().maximize();
			//Provide the delay of 2 seconds.
			Thread.sleep(2000);
			//To close the Browser
			driver.close();
		} 
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			 driver = new FirefoxDriver();

			//Maximize the browser window
			driver.manage().window().minimize();
			//Provide the delay of 2 seconds.
			Thread.sleep(4000);
			//To close the Browser
			driver.close();
		}
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			//Relative path of WebDriver.exe
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			
			driver = new EdgeDriver();

			//Maximize the browser window
			driver.manage().window().maximize();
			//Provide the delay of 2 seconds.
			Thread.sleep(2000);
			//To close the Browser
			driver.close();
		}
		else {
			System.out.println("Enter valid browser name");
		}
		sc.close();
	}
}
