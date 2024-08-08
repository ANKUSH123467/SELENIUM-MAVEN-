package pom;
//pom class
//constructor
//locate element
//actions:methods

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjectmodel {
		WebDriver driver;//global
		
		//constructor
		pageobjectmodel(WebDriver driver)//chrome,edge
		{
			this.driver=driver;
		}
		//locate Element
		By logo=By.cssSelector("img[alt='-branding']");
        By user_name=By.xpath("//input[@placeholder='Username']");
        By pass_word=By.xpath("//input[@placeholder='Password']");
        By clickbutton=By.xpath("//button[@type='submit']");
        
        //actions
        
        public void setUserName(String UserName)
        {
        	 driver.findElement(user_name).sendKeys(UserName);
             
        }
        public void setpasswdname(String password)
        {
        	 driver.findElement(pass_word).sendKeys(password);
             
        }
        public void clicksumit()
        {
        	 driver.findElement(clickbutton).click();
             
        }
        public Boolean chechklogo()
        {
        	Boolean status=driver.findElement(logo).isDisplayed();
			return status;
        }
        
        
        
        
       
		
	

}
