package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginpagetest {
	WebDriver driver;
	//pageobjectmodel ip;
	
	loginpage2 ip;
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	@Test(priority=2)
	void testlogin() 
	{
		ip.setUserName("Admin");
		ip.setpasswdname("admin123");
		ip.clicksumit();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@Test(priority=1)
	void logochechk()
	{
		ip=new loginpage2(driver);//object
		Assert.assertEquals(ip.chechklogo(),true);
	}
	@AfterClass
	void teardown() {
		driver.close();
	}
	
	

}
