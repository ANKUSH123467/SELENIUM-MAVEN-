package wait_command;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_demo {

	public static void main(String[] args) throws MalformedURLException {
      ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.com/");
		//driver.navigate().to("//https://www.amazon.com/");
		
		URL url=new URL("https://www.amazon.in/");
		driver.navigate().to(url);
		
		System.out.println(driver.getCurrentUrl());
        driver.get("https://www.flipkart.com/");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
	
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		
		driver.close();
		
		
		
		

	}

}
