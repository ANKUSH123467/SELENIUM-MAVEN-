package data_driven_testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fixedDepositCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
     String file=System.getProperty("user.dir")+"\\testing _data\\SImpleInteretsDataSet.xlsx";
     int rows=ExcelUtils.getRowCount(file, "Sheet1");//NO OF ROWS
     
     for(int i=1;i<=rows;i++)
     {
    	 String principal=ExcelUtils.getCellData(file, "Sheet1", i, 0);
    	 String rateofinterest=ExcelUtils.getCellData(file, "Sheet1", i, 1);
    	 String per1=ExcelUtils.getCellData(file, "Sheet1", i, 2);
    	 String per2=ExcelUtils.getCellData(file, "Sheet1", i, 3);
    	 String freq=ExcelUtils.getCellData(file, "Sheet1", i, 4);
    	 String exp_mvalue=ExcelUtils.getCellData(file, "Sheet1", i, 5);
    	 
    	 
    	 //pass the data to application
    	 
    	 driver.findElement(By.name("principal")).sendKeys(principal);
    	 driver.findElement(By.id("interest")).sendKeys(rateofinterest);
    	 driver.findElement(By.id("tenure")).sendKeys(per1);
    	 
    	 Select perdrop=new Select(driver.findElement(By.id("tenurePeriod")));
    	 perdrop.selectByVisibleText(per2);
    	 
    	 Select frequncencydrop=new Select(driver.findElement(By.name("frequency")));
    	 frequncencydrop.selectByVisibleText(freq);
    	 
    	 //clicking on calculate button
    	 JavascriptExecutor js = driver;
    	 WebElement calculate_button=driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img"));
    	 js.executeScript("arguments[0].click();", calculate_button);
    	 
    	 String act_mvalue=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
    	
    	 if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
    	 {
    		 System.out.println("test passed");//printing on console
    		 ExcelUtils.setCellData(file, "Sheet1", i,7,"passed");
    		 ExcelUtils.fillGreenColor(file, "Sheet1", i, 7);
    		
    	 }
    	 else
    	 {
    		 System.out.println("test failed");
    		 ExcelUtils.setCellData(file, "Sheet1", i,7,"failed");
    		 ExcelUtils.fillRedColor(file, "Sheet1", i, 7);
    	 }
    	 Thread.sleep(3000);
    	 //clicking on clear button
    	 WebElement clear_button=driver.findElement(By.xpath("//img[@class='PL5']"));
    	 js.executeScript("arguments[0].click();", clear_button);
     }
     driver.close();
	}

}
