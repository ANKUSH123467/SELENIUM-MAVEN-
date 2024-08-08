package wait_command;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		 driver.findElement(By.name("username")).sendKeys("Admin");
		    driver.findElement(By.name("password")).sendKeys("admin123");
		    driver.findElement(By.cssSelector("button.oxd-button ")).click();
		    
		    Thread.sleep(5000);
            driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
            
	}

}
