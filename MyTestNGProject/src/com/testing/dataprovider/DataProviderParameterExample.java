package com.testing.dataprovider;

import org.testng.annotations.Test;

public class DataProviderParameterExample {

	@Test(dataProvider = "scenarioData", dataProviderClass = DataproviderSource.class)
	public void scenario1(String scenarioData) {
		System.out.println("Scenario testing : Data("+scenarioData+")");
		
	}
	@Test(dataProvider = "scenarioData", dataProviderClass = DataproviderSource.class)
	public void scenario2(String scenarioData) {
		System.out.println("Scenario testing : Data("+scenarioData+")");
	}
		
	@Test(dataProvider = "scenarioData", dataProviderClass = DataproviderSource.class)
	public void Commonscenario(String scenarioData) {
		System.out.println("common Scenario testing : Data("+scenarioData+")");
		
	}
}
