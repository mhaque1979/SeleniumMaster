/**
 * 
 */
package functionLibrary;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Tamzid
 *
 */
public class OpenCloseBrowser {
	public static WebDriver driver;
	private static Logger LOG1 = Logger.getLogger(OpenCloseBrowser.class);
	/**
	 * @author Tamzid
	 * @description: Open any url with specified browser
	 * @browserName: any supported browser like chrome, FF, Safari
	 * @appURL: Application URL
	 */
	
public static void openBrowser(String browseName, String appURL) {
		if(browseName.equalsIgnoreCase("Firefox")) {
			try { 
				System.setProperty("webdriver.gecko.driver", "src\\Driver\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.get(appURL.trim());
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				LOG1.info("PASS.." + browseName + " browser open with <" + appURL + "> url successfully");
				//LogClass.pass(messages);
			}catch(Exception e) {
				LOG1.error("FAIL.." + browseName + " browser didn't open with <" + appURL + "> url");
			}
		}else if(browseName.equalsIgnoreCase("chrome")){
			try { 
				ChromeOptions option = new ChromeOptions();
				//option.addArguments("--disable-notifications");
				option.addArguments("--disable-notifications");
				System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
				driver=new ChromeDriver(option);
				driver.get(appURL.trim());
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				LOG1.info("PASS.." + browseName + " browser open with <" + appURL + "> url successfully");
				//LogClass.pass(messages);
			}catch(Exception e) {
				LOG1.error("FAIL.." + browseName + " browser didn't open with <" + appURL + "> url");
			}
		}else if(browseName.equalsIgnoreCase("IE")){
			try { 
				System.setProperty("webdriver.ie.driver", "src\\Driver\\iexploredriver.exe");
				driver=new InternetExplorerDriver();
				driver.get(appURL.trim());
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				LOG1.info("PASS.." + browseName + " browser open with <" + appURL + "> url successfully");
				//LogClass.pass(messages);
			}catch(Exception e) {
				LOG1.error("FAIL.." + browseName + " browser didn't open with <" + appURL + "> url");
			}
		}else {
			try {
				System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(appURL.trim());
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				LOG1.warn("Warning.." + browseName + " browser doesn't exsist.. hence system open chrome browser with specific application URL");
				//LogClass.pass(messages);
			}catch(Exception e) {
				LOG1.error("FAIL.." + browseName + " browser didn't open with <" + appURL + "> url");
			}
		}
	}


	
	public static void closeBrowser() {
		driver.quit();
		LOG1.info("Browser close successfully..");
	}

}
