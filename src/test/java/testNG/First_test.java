package testNG;

import org.testng.annotations.Test;

public class First_test {
	@Test(priority=1)
	void openURL()
	{
		System.out.println("this is openURL");
	}
	@Test(priority=2)
	void Login()
	{
		System.out.println("this is Login");
	}
	@Test(priority=3)
   void Logout()
		{
		System.out.println("this is Logout");
   }
   }
