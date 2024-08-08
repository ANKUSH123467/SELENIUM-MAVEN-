package window_handle;
import java.util.*;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	  Set windowids=  driver.getWindowHandles();
	  System.out.println(windowids);
	  List<String> al=new ArrayList(windowids);
	  String parentwindowids=al.get(0);
	  String childwindowid=al.get(1);
	  driver.switchTo().window(childwindowid);
	  driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
	  System.out.println(driver.getTitle());
	  driver.switchTo().window( parentwindowids);
	  driver.quit();
	    

	}

}
