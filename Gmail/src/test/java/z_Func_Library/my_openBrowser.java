package z_Func_Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class my_openBrowser {

	public static WebDriver mydr;

	public static void openBrowser (String browser, String URL) {
		if (browser.equalsIgnoreCase("chrome")) { 
			try {
				//System.setProperty("Webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
				//"webdriver.chrome.driver" always lower case
				
				System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
				mydr = new ChromeDriver();
				//mydr.get("URL"); //when we pass variable.. never use ""; "" means value
				mydr.get(URL);
				mydr.manage().window().maximize();
				mydr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (browser.equalsIgnoreCase("Firefox")) {

			try {
				System.setProperty("webdriver.gecko.driver", "src\\Driver\\geckodriver.exe");
				mydr = new FirefoxDriver ();
				mydr.get(URL);
				mydr.manage().window().maximize();
				mydr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			} catch (Exception e) {}




		}
	}




	public static void closeBrowser () {

		mydr.quit();
	}
}
