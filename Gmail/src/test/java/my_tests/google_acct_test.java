package my_tests;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class google_acct_test {

	public static WebDriver mydr;
	public static void main (String [] args){
		
		
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		mydr = new ChromeDriver ();
		mydr.get("https://www.google.com/");
		mydr.manage().window().maximize();
		mydr.findElement(By.xpath("//a[@ class='gb_P'][@data-pid='23']")).click();
		
		
		// To click on gmail link
		
		if (mydr.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__create-account']")).isDisplayed()) {
			
		System.out.println("Create Account is visible");
		
		mydr.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__create-account']")).click();
		
		
		
		//Switch window by page title
		Set <String> allPage=mydr.getWindowHandles();
		
		for (String page:allPage) {
			mydr.switchTo().window(page);
			String pTitle = mydr.getTitle();
			if(pTitle.contentEquals("Create your Google Account")) {
				 break;
			}
		}
		
		
		// to type name and info
		List<WebElement> xyz=mydr.findElements(By.name("firstName"));
		
		if(mydr.findElements(By.name("firstName")).size()>0) {
			System.out.println(xyz.size());
			mydr.findElement(By.name("firstName")).sendKeys("zubair");
		}

		
		
		
		}
		
		
	}
}
