package window_handle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_demo2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);
		
		WebElement reg=driver.findElement(By.xpath("//a[@class='ico-register']"));
		
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(reg).keyUp(Keys.CONTROL).perform();
		 Set <String>winids=  driver.getWindowHandles();
		  
		  List<String> wid=new ArrayList(winids);
		  
		  String parentid=wid.get(0);
		  String childid=wid.get(1);
		  //action on child window
		  driver.switchTo().window(childid);
		  driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		  
		  //action on parent window
		  driver.switchTo().window(parentid);
		  WebElement logo=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
  logo.isDisplayed();
	}

}
