package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Relative path of WebDriver.exe
       System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		
     //Maximize the browser window
	    WebDriver driver = new EdgeDriver();
	    
	  //Maximize the browser window
	  driver.manage().window().maximize();
		//Provide the delay of 2 seconds.
		   Thread.sleep(2000);
	       //To close the Browser
		   driver.close();
	}

}
