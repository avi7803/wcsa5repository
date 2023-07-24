package testNGAnnotations_Flags;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Search extends BaseTestNG {
	
  @Test(description="TestCase1")
  public void search1() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
	  Thread.sleep(2000);
  }
  
  @Test(description="TestCase2")
  public void search2() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("Sql",Keys.ENTER);
	  Thread.sleep(2000);
  }
  
  @Test(description="TestCase2")
  public void aearch3() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
	  Thread.sleep(2000);
  }
  
  //All methods are executed Alphabetically.....
  /* 1.aearch3()
   * 2. search2()
   * 3.search1()
   * And run with TestNG Suite */
}
