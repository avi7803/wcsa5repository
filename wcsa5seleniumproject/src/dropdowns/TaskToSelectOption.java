package dropdowns;

//Select the option without using Selection Method

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {

	public static void main(String[] args) throws InterruptedException {
		//Single Select Dropdown
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
        driver.get("D:\\WCSA5\\html files/SelectDropdown.html");
        
        //Identify Dropdown on WebPage
        WebElement dropDownElement =  driver.findElement(By.id("menu"));
        
        //handle the dropdown by creating object of select class
        Select sel = new Select(dropDownElement);
        
        //read all the options of dropdown 
        List<WebElement> allOps = sel.getOptions();
        
        //To read List use looping statements
        for (WebElement op : allOps) 
        {
			if (op.getText().equals("Milk Shake")) 
			{
				Thread.sleep(2000);
				op.click();
				break;
			} 
		}

	}

}
