package assignments;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {

	public static void main(String[] args) throws InterruptedException {
	   //By using Hashset
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
        driver.get("D:\\WCSA5\\html files/MultiSelectDropdown.html");
		//identify dropdown
        WebElement dropDownElement = driver.findElement(By.id("i1"));
        
        //Handle dropdown
        Select sel = new Select(dropDownElement);
        
        HashSet<String> hs = new HashSet<String>();
        
        //To read options from Dropdown
        List<WebElement>  allOpt = sel.getOptions();
        
        //to read options from dropdown
        for(int i=0;i<allOpt.size();i++)
        {
            WebElement op = allOpt.get(i);
            String value = op.getText();
            //add the value into the set that means duplicates will not be allowed
            //insertion order won't be maintained
            hs.add(value);
        }
        //Read the value from Set 
        for(String element:hs)
        {
        	Thread.sleep(2000);
        	System.out.println(element);
        }
        
	}

}
