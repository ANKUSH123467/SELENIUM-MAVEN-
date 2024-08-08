package window_handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date_picker {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");

		//approach 1
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/03/2023");

		//approach 2
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String year="2020";
		String month="May";
		String date="20";
		//selecting ,month and year
		while(true)
		{
			String yr=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			String mon=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			if(year.equals(yr) && month.equals(mon))
			{
				break;
			}
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click(); //past
		}

		//date
		List <WebElement> alldates =driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//table//td"));
		for(WebElement dates:alldates)
			{
		if(dates.getText().equals(date))
		{
				dates.click();
				break;
		}


		//}
//		for(int i=0;i<alldates.size();i++)
//		{
//			if(alldates.get(i).getText().equals(date))
//			{
//				alldates.get(i).click();
//				break;
//			}
	}
	}

}
