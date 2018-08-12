package revisions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_a_webpage {

					public static WebDriver mydr;
			
	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
			mydr = new ChromeDriver ();
			mydr.get("https://www.cnn.com/");
			mydr.manage().window().maximize();
			mydr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			// TO CLICK AN ITEM
			
			mydr.findElement(By.xpath("//*[@id=\"search-button\"]")).click();
			
			// TO TYPE ANYTHNING
			
			mydr.findElement(By.xpath("//*[@id=\"search-input-field\"]")).sendKeys("Bangladesh");
			mydr.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();

	}
	
	

}
