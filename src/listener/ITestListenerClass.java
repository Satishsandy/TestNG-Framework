package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

class ITestListenerClass implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		
		System.out.println("on Finish");
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("on Start");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("on TestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on TestSkipped");
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on TestStart");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on TestScucess");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	
		
	

}
