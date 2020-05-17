package base;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample2Test {

	@Test
	public void print2()
	{
		System.out.println("print2");
		System.out.println("develop");
		System.out.println("develop");
		System.out.println("develop");
		System.out.println("develop");
	}
	
	
	@Test
	public void print3()
	{
		System.out.println("print3");
	}
	
	@BeforeTest
	public void anno()
	{
		System.out.println("Before Test");
	}
}
