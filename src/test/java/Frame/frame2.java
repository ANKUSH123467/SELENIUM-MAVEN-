package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ui.vision/demo/webtest/frames/");
	WebElement	frm1=driver.findElement(By.xpath("html/frameset/frame[1]"));
	driver.switchTo().frame(frm1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("11111");
		
		WebElement frm3=driver.findElement(By.xpath("/html/body"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("333");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[1]/div/div']")).click();													
		driver.switchTo().defaultContent();
		
		
		WebElement frame5=driver.findElement(By.xpath("/html/frameset/frame[2]"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']"));
		driver.close();
		
	
		
		
	}

}
