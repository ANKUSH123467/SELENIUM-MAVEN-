package wait_command;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_chechboxes {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		List <WebElement> checkbox =driver.findElements(By.xpath("//*[@class='form-check-input'and @type='checkbox']"));
		
//		for (WebElement chk:checkbox)
//		{
//			chk.click();
//		}
		            //select all chechkboxes
//		for (int i = 0 ; i<checkbox.size();i++) {
//			checkbox.get(i).click();
//		}

	               //select last three
//		for (int i = 4 ; i<checkbox.size();i++) {
//			checkbox.get(i).click();
//		}
	
		    //select first three
//		for (int i = 0 ; i<3;i++) {
//			checkbox.get(i).click();
//		}		
		
// unselected the selected checkbox		
		for (int i = 0 ; i<3;i++) {
			checkbox.get(i).click();
		}
		
		Thread.sleep(5000);

		for (int i = 0 ; i<checkbox.size();i++) {

			if(checkbox.get(i).isSelected())
			{
				checkbox.get(i).click();
			}
			
			
			}
		}
	}