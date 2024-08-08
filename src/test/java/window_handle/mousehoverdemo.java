package window_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoverdemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
        WebElement computer=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));//desktop
        WebElement software=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']"));//mac
        
        Actions act=new Actions(driver);
        Thread.sleep(3000);
        
        act.moveToElement(computer).moveToElement(software).click().perform();
        
	}

}
