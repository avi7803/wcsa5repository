	package testNGAnnotations_Flags;
	
	import org.testng.annotations.Test;
	
	import java.time.Duration;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	
	public class ActiTimeDataProvider {
		
	  @Test(dataProvider = "actiTimeData")
	  public void f(String usn, String pass)
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("http://avinash-patil/login.do");
			
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
			driver.close();
	  }
	  
	
	  @DataProvider(name="actiTimeData")
	  public Object[][] testData() 
	  {
	    Object[][] data = new Object[5][2];
	    
	    data[0][0]="ad_min";
	    data[0][1]="mana-ger";
	    
	    data[1][0]="manager";
	    data[1][1]="admin";
	    
	    data[2][0]="@admin";
	    data[2][1]="@manager";
	    
	    data[3][0]="ad123";
	    data[3][1]="man456";
	    
	    data[4][0]="ad_min1";
	    data[4][1]="mana-ger2";
	    
		return data;
	  }
	}
