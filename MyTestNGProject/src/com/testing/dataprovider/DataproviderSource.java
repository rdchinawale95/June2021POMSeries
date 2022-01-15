package com.testing.dataprovider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataproviderSource {
	
	@DataProvider(name="TestType")
	public static Object[][] getTestTypeData(ITestContext context){//Itestcontext is used to get test case name at the run time 
		String testCase= context.getName();
		if("Integrationlevel".equals(testCase)) {
			return new Object[][] {{"integration test Data"}};
		}else if("Accepatancelevel".equals(testCase)) {
			return new Object[][] {{"acceptance test Data"}};
		}else {
			return new Object[][] {{"common test Data"}};		
		}
	}
	
	@DataProvider(name="scenarioData")
	public static Object[][] getscenarioData(Method method){
		String testCase= method.getName();
		if("scenario1".equals(testCase)) {
			return new Object[][] {{"Scenario1 Data"}};
		}else if("scenario2".equals(testCase)) {
			return new Object[][] {{"Scenario2 Data"}};
		}else {
			return new Object[][] {{"common scenario	 Data"}};		
		}
	}
	
		
	
	}


