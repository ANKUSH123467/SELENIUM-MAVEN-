package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotationdemo {
	//@BeforeMethod
	//@BeforeClass
	//@BeforeTest
	@BeforeSuite
	void login()
	{
		//System.out.println("this is login method");
		System.out.println("this is before test ");
		
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("this is search method");
	}
	@Test(priority=2)
	void Advancesearch()
	{
		System.out.println("this is Advancesearch method");
	}
	//@AfterMethod
	//@AfterClass
	//@AfterTest
	@AfterSuite
	void logout()
	{
		//System.out.println("this is logout method");
		System.out.println("this is aftertest ");
	}

}
