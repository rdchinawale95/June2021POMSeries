package com.testing.dataprovider;

import org.testng.annotations.Test;

public class DataProviderAcceptanceExample {
	
	@Test(dataProvider = "TestType", dataProviderClass = DataproviderSource.class)
	public void acceptanceTest(String data) {
	
				System.out.println("Acceptance testing : Data("+data+")");
	}
}

