package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod3 {
	 @Test
	  public void testMEthod5() {
		  
		  long threadId5 = Thread.currentThread().getId();
		  
		  Reporter.log("Thread Id of TestMethod5 : "+threadId5,true);
	  }
	  
	  @Test
	  public void testMEthod6() {
		  
		  long threadId6 = Thread.currentThread().getId();
		  
		  Reporter.log("Thread Id of TestMethod6 : "+threadId6,true);
	  }
}
