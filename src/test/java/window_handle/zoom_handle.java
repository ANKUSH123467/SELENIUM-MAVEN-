package window_handle;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoom_handle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = driver;
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='80%'");

		js.executeScript("document.body.style.zoom='35%'");


	}

}
