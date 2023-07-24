package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllTestNGAnnotations {
  @Test
  public void method1() {
	  Reporter.log("TestAnnotation", true);
  }
  
  @BeforeTest
  public void method2() {
	  Reporter.log("BeforeTestAnnotation", true);
  }
  
  @AfterTest
  public void method3() {
	  Reporter.log("AfterTestAnnotation", true);
  }
  
  @BeforeSuite
  public void method4() {
	  Reporter.log("BeforeSuiteAnnotation", true);
  }
  
  @AfterSuite
  public void method5() {
	  Reporter.log("AfterSuiteAnnotation", true);
  }
  
  @BeforeMethod
  public void method6() {
	  Reporter.log("BeforeMethodAnnotation", true);
  }
  
  @AfterMethod
  public void method7() {
	  Reporter.log("AfterMethodAnnotation", true);
  }
  
  
  
  
}
