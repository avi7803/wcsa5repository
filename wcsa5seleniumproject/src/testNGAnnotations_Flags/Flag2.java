package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
	//Default value of Enabled is TRUE
	
  @Test(enabled = true)
  public void method1() {
	  Reporter.log("method1 from flag2",true);
  }
  
  @Test(enabled = false) //It disables the method2
  public void method2() {
	  Reporter.log("method2 from flag2",true);
  }
  
  @Test(description="Login Method",enabled = true) //Both flags can be use together
  public void method3() {
	  Reporter.log("method3 from flag2",true);
  }
}
