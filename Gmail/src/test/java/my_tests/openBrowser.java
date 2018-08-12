package my_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openBrowser {
	
	public static WebDriver mydr;
	
	public static void openB (String BrowserName, String URL) {

		if (BrowserName.equalsIgnoreCase("Firefox")) {
			
			try {
				System.setProperty("webdriver.gecko.driver", "src//Driver//geckodriver.exe");
				
				mydr= new FirefoxDriver ();
				mydr.get(URL);
				mydr.manage().window().maximize();
				mydr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				
			} catch (Exception e) {}
			
		
		
		} else if (BrowserName.equalsIgnoreCase("Chrome")) {
			
			try {
				System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
				mydr = new ChromeDriver ();
				mydr.get(URL);
				mydr.manage().window().maximize();
				mydr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				
				
			} catch (Exception e) {}
			
		}
		}
		
		
		

}
