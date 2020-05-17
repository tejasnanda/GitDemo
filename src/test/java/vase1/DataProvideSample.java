package vase1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideSample {

@Test(dataProvider ="getData" )
public void dataProviderSample(int data1 , int data2)
{
	System.out.println(data1 +","+ data2);
}
	
@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[][]{{1,1},{2,2},{3,3}};
	
//OR 
	
	
		/*
		 * data[0][0]=1; data[0][1]=1;
		 * 
		 * 
		 * data[1][0]=2; data[1][1]=2;
		 * 
		 * 
		 * data[2][0]=3; data[2][1]=3;
		 */		
	return data;
}
	
}

