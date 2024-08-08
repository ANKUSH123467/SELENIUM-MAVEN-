package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class groupingdemo {
	
	@Test(priority=1,groups= {"sanity","regrisson"})
	void loginByEmail()
	{
		//System.out.println("this is login method");
		System.out.println("this is login by email ");
		
	}
	@Test(priority=2,groups={"sanity"})
	void loginbyfacebook()
	{
		System.out.println("this is loginbyfacebook");
	}
	@Test(priority=3,groups= {"sanity"})
	void siginbytwitter()
	{
		System.out.println("this is siginbytwitter");
	}
	
	@Test(priority=4,groups= {"sanity","regrissson"})
	
	void siginByEmail()
	{
		//System.out.println("this is login method");
		System.out.println("this is sign by email ");
		
	}
	@Test(priority=5,groups= {"regrission"})
	void siginbyfacebook()
	{
		System.out.println("this is siginbyfacebook");
	}
	@Test(priority=6,groups= {"regrisson"})
	void loginbytwitter()
	{
		System.out.println("this is loginbytwitter");
	}
	@Test(priority=7,groups= {"sanity","regrisson","functional"})
	void paymentinrupee ()
	{
		//System.out.println("this is login method");
		System.out.println("this is paymentinrupee ");
		
	}
	@Test(priority=8,groups= {"sanity"})
	void paymentindollar ()
	{
		System.out.println("this is paymentindollar ");
	}
	@Test(priority=9,groups= {"sanity","regrisson","functional"})
	void payementreturnbybank()
	{
		System.out.println("this is returnbybank");
	}
	}


