package genericPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener extends BaseTest implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		Reporter.log("Test start!!",true);
	}


	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test successfull!!",true);
	}

	//This method decides that what to do after test failed
	
	public void onTestFailure(ITestResult result) {
		String failedMethodName = result.getMethod().getMethodName();
		Reporter.log("This method is failed aand taken a Screenshot"+failedMethodName,true);
		failedMethod(failedMethodName);
	}

	
	public void onTestSkipped(ITestResult result) {
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}


	public void onStart(ITestContext context) {
		Reporter.log("on start Test!!",true);
	}


	public void onFinish(ITestContext context) {
		Reporter.log("on finish Test!!",true);
	}

	
}
