package vase1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Sample4 {

	@Test
	public void aestMethod()
	{
		System.out.println("order1 package");
	}
	
	@Test
	public void zestMethod5()
	{
		System.out.println("order3 packljflefage");
	}
	
	
	@Test
	public void gestMethod6()
	{
		System.out.println("order2 kljkljrlkj");
	}
	
	@BeforeSuite
	public void testMethod1()
	{
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void testMethod2()
	{
		System.out.println("AfterSuite");
	}
	
	@BeforeMethod
	public void testMethod4()
	{
		System.out.println("BEforemethod");
	}
	
	@BeforeClass
	public void testgh()
	{
		System.out.println("Before Class");
	}
}
