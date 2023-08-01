package testNGAnnotations_Flags;

import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void loginMethod() 
  {
	  System.out.println("This for Login Method");
  }
  
  @Test(dependsOnMethods = "loginMethod")
  public void createUserMethod()
  {
	  System.out.println("This for Create User Method");
  }
  
  @Test(dependsOnMethods = "createUserMethod")
  public void logoutMethod()
  {
	  System.out.println("This for logout Method");
  }
}
