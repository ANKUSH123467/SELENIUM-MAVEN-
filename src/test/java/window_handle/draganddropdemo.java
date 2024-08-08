package window_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropdemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement  country=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement  capital=driver.findElement(By.xpath("//div[@id='box106']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(country, capital).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
