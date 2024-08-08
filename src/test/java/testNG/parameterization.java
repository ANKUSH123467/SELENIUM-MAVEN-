package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterization {
	ChromeDriver driver;
	@BeforeClass
	
	void Setup()
	{
		 driver= new ChromeDriver();
	}
	
	@Test
	void TestURL()
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2, dataProvider="dp")
	void Login(String email, String password)
	{
		
		driver.findElement(By.id("Email")).sendKeys("email");
		driver.findElement(By.id("Password")).sendKeys("1234");
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		String exp= "nopCommerce demo store";
		String act= driver.getTitle();
		Assert.assertEquals(exp, act);
	}
	
	@Test
	void teardown()
	{
		driver.close();
	}
	
	@DataProvider(name="dp", indices= {0,1})
	String [][] loginData()
	{
		String data [][]= {
				{"abc@gmail.com", "test"},
				{"john@gmail.com", "test`12"},
				{"mk@gmail.com", "test`1"}
				
		};
		return null;
    
    
}}

