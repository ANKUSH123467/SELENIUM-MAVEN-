package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopping_cart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/notebooks");
		 driver.findElement(By.id("small-searchterms")).sendKeys("lenovo");
		 driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")).click();
		 Thread.sleep(3000);
		 System.out.println(driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[2]")).getText().contains("1"));
		 

	}

}
