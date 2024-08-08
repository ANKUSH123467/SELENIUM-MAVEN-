package locator;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class locator_3 {

	public static void main(String[] args) {
		ChromeDriver  driver= new ChromeDriver();
      driver.get("https://demo.nopcommerce.com/");
      
      
      //tag # id
     driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mac");
     
     //tag.class
     driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mobile");

     //tag and attribute input[Name='q']
     driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("samsung");
     
     //tag class and attributes
     driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("k");
     driver.findElement(By.cssSelector("input.button-1 search-box-button")).click();
     driver.close();


  
	}

}
