package window_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclickdemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult")	; //name
		WebElement button=driver.findElement(By.xpath("//input[@id='field1']"));
		button.clear();//clear text
		button.sendKeys("welcome");
		Thread.sleep(3000);
		
		WebElement button2=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
				Actions act=new Actions(driver);
		act.doubleClick(button2).perform();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='field2']")).getAttribute("value"));
		
		
		
		
		
		
		
		
	}

}
