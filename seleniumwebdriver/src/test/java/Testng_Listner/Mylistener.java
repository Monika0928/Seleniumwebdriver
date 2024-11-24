package Testng_Listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener implements ITestListener //control and tap
{
	public  void onStart(ITestContext context) {
	    // not implemented
		System.out.println("this is on start.............");
	  }
	public  void onTestStart(ITestResult result) {
	    // not implemented
		System.out.println("this is on teststart.............");
	  }
	public  void onTestSuccess(ITestResult result) {
	    // not implemented
		System.out.println("this is on testsuccess.............");
	  }
	public  void onTestFailure(ITestResult result) {
	    // not implemented
		System.out.println("this is on testfailure.............");
	  }
	public  void onTestSkipped(ITestResult result) {
	    // not implemented
		System.out.println("this is on testskipped.............");
	  }
}
