package wait_command;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts_popuas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		   // Maximizes the Window
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(3000);
       Alert alert1= driver.switchTo().alert();
       alert1.accept();
      // alert.dismiss();
       
        System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
        
       // 
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
       Alert alert2= driver.switchTo().alert();
       alert2.accept();
      // alert.dismiss();
       
        
        System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
        
        // 
        
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
       Alert alert3= driver.switchTo().alert();
       alert3.sendKeys("Bye");
       alert3.accept();
      // alert.dismiss();
        
        System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
        	
	}

}		
	
	       

	


