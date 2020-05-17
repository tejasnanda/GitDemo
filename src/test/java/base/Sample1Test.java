package base;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample1Test {

	@BeforeTest
	public void BeforeTestmehod()
	{
		System.out.println("HEllo");
	}
	@Test(groups= {"smoke","Regression"})
	public void print()
	{
		System.out.println("print1");
	}
	
	@Test(groups= {"smoke"})
	public void printSample1()
	{
		System.out.println("print1tejas");
	}
	
	@Test(groups= {"smoke"})
	public void print1Sample1()
	{
		System.out.println("print1");
	}
	
}
