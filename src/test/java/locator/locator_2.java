package locator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//three requirements
//1> how many total no of sliders in the page.
//2> how many total no of images in the page.
//3> find total no of links available on the page.


public class locator_2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php\r\n"
				+ "");
		List<WebElement> slider=driver.findElements(By.className("homeslider-container"));
      System.out.println("the total no of slider are"   + slider.size());
     List<WebElement> images=driver.findElements(By.tagName("img"));
     System.out.println("the no of images are"   + images.size());
     List<WebElement> links=driver.findElements(By.tagName("a"));
      System.out.println("the no of links are"   + links.size());



	}

}
