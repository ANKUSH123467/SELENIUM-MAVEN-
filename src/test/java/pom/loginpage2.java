package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom class.... page factory
public class loginpage2 {
	WebDriver driver;//global
	 
	//constructor
	loginpage2(WebDriver driver)//chrome,edge
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//uses for pom classs
	}
	//locate element
	@FindBy(css="img[alt='company-branding']")
	WebElement logo;
	
	@FindBy(name="username")
	WebElement user_name;
	
	@FindBy(name="password")
	WebElement pass_word;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickbutton;
	
	   //action
	 public void setUserName(String UserName)
     {
      user_name.sendKeys(UserName);
          
     }
     public void setpasswdname(String password)
     {
     	 pass_word.sendKeys(password);
          
     }
     public void clicksumit()
     {
     	  clickbutton.click();
          
     }
     public Boolean chechklogo()
     {
     	Boolean status= logo.isDisplayed();
			return status;
     }
     
     
	
	
	

}
