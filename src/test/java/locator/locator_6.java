package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class locator_6 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
	WebElement self=driver.findElement(By.xpath("//*[@id=\"pid3\"]"));
	System.out.println(self.getText());
	
//	WebElement below=driver.findElement(RelativeLocator.with(By.tagName("li")).below(self));
//	System.out.println(below.getText());
		
		
		

	}

}
