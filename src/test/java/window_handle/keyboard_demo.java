package window_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//ctrlA
//CNTRLC
//CNTRLV

public class keyboard_demo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("hello selenium");
		//cntrlA
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).sendKeys("C").keyUp(Keys.TAB).perform();
		
		//
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		//cntrl+shiftA
		act.keyDown(Keys.CONTROL).sendKeys(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
		
		
		//Enter
		act.keyDown(Keys.CONTROL).keyUp(Keys.CONTROL).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
