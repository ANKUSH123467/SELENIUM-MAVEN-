package window_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class sliderdemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		Thread.sleep(3000);
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println("location of element before slider"+slider.getLocation());
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider,100, 0).perform();
		System.out.println("location of element after slider"+slider.getLocation());
		

	}

}
