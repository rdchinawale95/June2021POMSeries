package com.testng.listener;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.ITestListener;


//Listeners can be used with any class just we have to put the xml coded listeners to the class's xml file
public class DemoListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started : "+ result.getName());

	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Successful : "+ result.getName());
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed : "+ result.getName());
	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped : "+ result.getName());
	}
	
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Failed : "+ result.getName());
	}
	
	
	@Override
	public void onStart(ITestContext context) {
		
	}
	

	@Override
	public void onFinish(ITestContext context) {
		
	}
}
