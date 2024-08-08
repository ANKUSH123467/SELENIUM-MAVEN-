package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependenciesmethod {
	@Test(priority=1)
	void openURL() 
	{
		Assert.assertTrue(true);
	}
	@Test(priority=2,dependsOnMethods= {"openURL"})
	void login()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=3,dependsOnMethods= {"login"})
      void Search()
	{
    	  Assert.assertTrue(false);
      }
	@Test(priority=4,dependsOnMethods= {"login","search"})
	void AdvanceSearch()
	{
		Assert.assertTrue(false);
	}
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout()
	
	{
		Assert.assertTrue(true);
	}
	
}
