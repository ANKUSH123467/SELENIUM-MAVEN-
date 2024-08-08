package window_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		WebElement num = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement DAmount = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(num, DAmount).perform();
		
		Thread.sleep(3000);
		WebElement num2 = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		WebElement CAmount = driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		act.dragAndDrop(num2, CAmount).perform();
		
		Thread.sleep(3000);
		WebElement sales = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement CAccount = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		act.dragAndDrop(sales, CAccount).perform();
		
		Thread.sleep(3000);
		WebElement bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement DAccount = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		act.dragAndDrop(bank, DAccount).perform();
		
		WebElement button = driver.findElement(By.xpath("//a[normalize-space()='Perfect!']"));
		Thread.sleep(3000);
		
		if("Perfect!".equals(button.getText())) 
			System.out.println("Pass");
		else
			System.out.println("Fail");

	}

}
