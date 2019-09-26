package Automation.Selenium;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamClass {
	
	
	@Test
	@Parameters({"userName","passWord"})
	public void method(String userName,String pass)
	{
		System.out.println("userName: "+userName);
		System.out.println("password: "+pass);
	}
	
	@Test
	@Parameters({"userName","passWord"})
	public void methods(String userName,String pass)
	{
		System.out.println("userName: "+userName);
		System.out.println("password: "+pass);
	}

}
