package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
        driver.get("D:\\WCSA5\\html files/SelectDropdown.html");
        
        //Identify Dropdown on Webpage
        WebElement dropDownElement =  driver.findElement(By.id("menu"));
        
        //handle the dropdown by creating object of select class
        Select sel = new Select(dropDownElement);
        
        //Select the option from dropdown
        //use selection methods
        Thread.sleep(2000);
        
        sel.selectByIndex(2); //From single select Dropdown
        Thread.sleep(2000);
        
        //Try to deselect given option from dropdown
        sel.deselectByIndex(2);
	}

}
