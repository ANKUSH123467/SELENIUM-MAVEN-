package wait_command;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   // Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	    
	    WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    
	    
	    
	    
	    
	    mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	    
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    
	    
	    mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	    
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    
	    
	    
	    
	  //  wait.until(d -> revealed.isDisplayed());
		
	}

}
