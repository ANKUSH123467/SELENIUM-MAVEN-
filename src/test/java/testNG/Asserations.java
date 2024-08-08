package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserations {
	@Test
	void test()
	{
	//	int x=10;
		//int y=30;
		
		//Assert.assertEquals(x,y);//hard asserations
		//Assert.assertTrue(true);//passed
		//Assert.fail();//fail
		//Assert.assertFalse(false);
		
		
		//int a=30;
		//int b=20;
		
		//Assert.assertEquals(a>b,true,"a is not smaller than b");//false
		
		
		//String a1="abc";
		//String a2="abc";
		//.assertEquals(a1,a2,"both values are equals");//passed
		
		if(true)
			Assert.assertTrue(true);
		else
		// Assert.assertFalse(false);
			Assert.fail();
		
		
		
		
	}

}
