package com.testng.training;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestcaseDependecy {


	@Test
	public void start() {
		System.out.println("start");
		
	}
	
	@Test(dependsOnMethods = "start")
	public void init() {
		System.out.println("initializing");
		
	}
	
	@Test(dependsOnMethods = "init")
	public void process() {
		Assert.assertTrue(false);    //deliberately failing
		System.out.println("processing");
		
	}
	
	@Test(dependsOnMethods = {"process","init"} )
	public void stop() {
		System.out.println("stop");
		
	}
	
}
