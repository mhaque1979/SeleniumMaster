package revisions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opencloseBR {
	
	public static WebDriver dr;
	
	public static void openBR(String URL) {
		
		System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
		dr = new ChromeDriver ();
		dr.get(URL);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static void closeBR() {
		
		dr.quit();
		
	}
	
	
	

}
