package methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_methods {
	//
	//get(url)
	//getTitle()
	//getcurrentURL()
	//getpagesource()
	//getWindowHandle()
	//getWindowHandles()

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	//System.out.println(driver.getTitle());
	//System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	//String id=driver.getWindowHandle();
	//System.out.println("Window id for login" + id);
	
	
	Set<String> wids=driver.getWindowHandles();
	//List ids=new ArrayList(wids);
	//system.out.println(wids);
	for(String id:wids)
	{
		System.out.println(id);
	}
	
   //  driver.close();
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
