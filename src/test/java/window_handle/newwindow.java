package window_handle;

import org.openqa.selenium.chrome.ChromeDriver;

public class newwindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);

	}

}
