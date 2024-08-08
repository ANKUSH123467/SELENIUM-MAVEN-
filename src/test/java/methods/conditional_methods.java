package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditional_methods {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//isDisplayed();
		Boolean logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("the logo is diplayed"+ logo); //true
		
		//isEnabled()
		
	Boolean	 textbox=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
  System.out.println("the textbox is enabled"+ textbox);
     
     //isSelected
  WebElement Male=driver.findElement(By.xpath("//input[@id='gender-male']"));
  WebElement Female=driver.findElement(By.xpath("//input[@id='gender-female']"));
  
  
  System.out.println("before select:");
  System.out.println(Male.isSelected());
  System.out.println(Female.isSelected());
  
  Male.click();
  System.out.println("after select:");
  System.out.println(Male.isSelected());
  System.out.println(Female.isSelected());
  
   driver.close();
  
	}

}
