package wait_command;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_dropdown {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drpdown=driver.findElement(By.xpath("//select[@id='country']"));
		drpdown.click();
		
		
		
	Select dropdown=new Select(drpdown);
	           //by text
	//	dropdown.selectByVisibleText("Germany");
	
	                //by value
	  // dropdown.selectByValue("uk");
	                 //by index
	   //  dropdown.selectByIndex(4);
	 List <WebElement> drpdown1=driver.findElements(By.xpath("//select[@id='country']//option"));
	 System.out.println(drpdown1.size());
	     //for each loop
	 for(WebElement dpwn:drpdown1) {
		 System.out.println(dpwn.getText());
		    
		 
	 }
	      
		//Thread.sleep(5000);
		driver.close();
		


	}

}
