package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hardsoftassertion {
	@Test
	void test()
	{
		int x=10;
		int y=15;
		//Assert.assertEquals(x,y);
	//	Assert.assertEquals(x>y,true,"a is not grater than b");
		
		
				
	}
	@Test
	void Hardassertion()
	{
		System.out.println("testing......");
		System.out.println("testing......");
		System.out.println("testing......");
		System.out.println("testing......");
		
		Assert.assertTrue(false);
		System.out.println("this is the example of hardasserrtion");
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	@Test
	void softassertion()
	{
		System.out.println("testing......");
		System.out.println("testing......");
		System.out.println("testing......");
		System.out.println("testing......");
		SoftAssert sa=	new SoftAssert ();//requird
		
		sa.assertTrue(true);
		sa.assertTrue(true);
		sa.assertTrue(true);
		
		sa.assertAll();//requried
		
		
		
	}
	
	
	
	
	

}
