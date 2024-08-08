package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class locator_5 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

	List<WebElement> pre=	driver.findElements(By.xpath("//*[@id='email']//preceding::*"));
	//System.out.println("preceding size is" +pre.size());
	
	List<WebElement> foll=	driver.findElements(By.xpath("//*[@id='email']//following::*"));
	//System.out.println("following size is" +foll.size());
	
	for(WebElement i=pre)
	{
		System.out.println(i.getText());
	}
		
		

	}

}
