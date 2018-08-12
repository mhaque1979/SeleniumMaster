package FuntionLib_WD;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class OpenCloseBrowser {

	private static Logger LOG1 = Logger.getLogger(OpenCloseBrowser.class);
	
	public static WebDriver openBrowser(WebDriver dr,String browseName, String appURL) {
		if(browseName.equalsIgnoreCase("Firefox")) {
			try { 
				System.setProperty("webdriver.gecko.driver", "src\\Driver\\geckodriver.exe");
				dr=new FirefoxDriver();
				dr.get(appURL.trim());
				dr.manage().window().maximize();
				dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				LOG1.info("PASS.." + browseName + " browser open with <" + appURL + "> url successfully");
				//LogClass.pass(messages);
			}catch(Exception e) {
				LOG1.error("FAIL.." + browseName + " browser didn't open with <" + appURL + "> url");
			}
		}else if(browseName.equalsIgnoreCase("chrome")){
			try { 
				System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
				dr=new ChromeDriver();
				dr.get(appURL.trim());
				dr.manage().window().maximize();
				dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				LOG1.info("PASS.." + browseName + " browser open with <" + appURL + "> url successfully");
				//LogClass.pass(messages);
			}catch(Exception e) {
				LOG1.error("FAIL.." + browseName + " browser didn't open with <" + appURL + "> url");
			}
		}else if(browseName.equalsIgnoreCase("IE")){
			try { 
				System.setProperty("webdriver.ie.driver", "src\\Driver\\iexploredriver.exe");
				dr=new InternetExplorerDriver();
				dr.get(appURL.trim());
				dr.manage().window().maximize();
				dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				LOG1.info("PASS.." + browseName + " browser open with <" + appURL + "> url successfully");
				//LogClass.pass(messages);
			}catch(Exception e) {
				LOG1.error("FAIL.." + browseName + " browser didn't open with <" + appURL + "> url");
			}
		}else {
			try {
				System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
				dr=new ChromeDriver();
				dr.get(appURL.trim());
				dr.manage().window().maximize();
				dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				LOG1.warn("Warning.." + browseName + " browser doesn't exsist.. hence system open chrome browser with specific application URL");
				//LogClass.pass(messages);
			}catch(Exception e) {
				LOG1.error("FAIL.." + browseName + " browser didn't open with <" + appURL + "> url");
			}
		}
		
		return dr;
	}

	
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
		LOG1.info("Browser close successfully..");
	}
}
