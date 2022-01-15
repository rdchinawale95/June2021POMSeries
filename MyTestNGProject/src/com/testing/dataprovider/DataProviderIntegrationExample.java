package com.testing.dataprovider;

import org.testng.annotations.Test;

public class DataProviderIntegrationExample {
	
	@Test(dataProvider = "TestType", dataProviderClass = DataproviderSource.class)
	public void integrationTest(String data) {
	
				System.out.println("Integration testing : Data("+data+")");
	}
}

