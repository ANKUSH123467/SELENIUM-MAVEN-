package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FreameDemo1 {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("hello frames");
	
	//approach1 using id/name
	//driver.switchTo().frame("frm1");
	
	
	//approach---2 web element
	WebElement frame1=driver.findElement(By.xpath("//*[@id=\"frm1\"]"));
	driver.switchTo().frame(frame1);
	
	WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
	
	
	Select Select_dropdown=new Select(dropdown);
	Select_dropdown.selectByVisibleText("- java");
	driver.switchTo().defaultContent();
	driver.close();
	
	

	}

}
