package Automation.Selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class TestngDemo {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	@BeforeMethod
	public void beforeMethodSecond()
	{
		System.out.println("beforeMethodSecond");
	}
	
	@Test
	public void testMethod() 
	{
		System.out.println("TestMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}


	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest");
	}


	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite");
	}

}
