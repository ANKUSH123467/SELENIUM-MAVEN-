package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_xpath {
	//text
	//text[text()='text']
	//a[text()='desktop']
	
	
	

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
	
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("t-shirts");
	

		

	}

}
