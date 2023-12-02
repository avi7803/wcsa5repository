package genericPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test start!!",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test successfull!!",true);
	}

	//This method decides that what to do after test failed
	@Override
	public void onTestFailure(ITestResult result) {
		String failedMethodName = result.getMethod().getMethodName();
		Reporter.log("This method is failed and taken a Screenshot"+failedMethodName,true);
		failedMethod(failedMethodName);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("on start Test!!",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("on finish Test!!",true);
	}

	
}
