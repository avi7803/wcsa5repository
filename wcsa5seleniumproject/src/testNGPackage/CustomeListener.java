package testNGPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListener extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test executed successfully!!",true);
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		String failedMethodName = result.getMethod().getMethodName();
		Reporter.log("This method failed and taken SS : " +failedMethodName,true);
		failedMethod(failedMethodName);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Test actual started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Test Finished!!",true);
	}

	
}
