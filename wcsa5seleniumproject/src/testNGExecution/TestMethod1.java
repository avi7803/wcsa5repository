package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod1 {
  @Test
  public void testMEthod1() {
	  
	  long threadId1 = Thread.currentThread().getId();
	  
	  Reporter.log("Thread Id of TestMethod1 : "+threadId1,true);
  }
  
  @Test
  public void testMEthod2() {
	  
	  long threadId2 = Thread.currentThread().getId();
	  
	  Reporter.log("Thread Id of TestMethod : "+threadId2,true);
  }
}
