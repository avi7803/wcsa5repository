package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod2 {
	 @Test
	  public void testMEthod3() {
		  
		  long threadId3 = Thread.currentThread().getId();
		  
		  Reporter.log("Thread Id of TestMethod3 : "+threadId3,true);
	  }
	  
	  @Test
	  public void testMEthod4() {
		  
		  long threadId4 = Thread.currentThread().getId();
		  
		  Reporter.log("Thread Id of TestMethod4 : "+threadId4,true);
	  }
}
