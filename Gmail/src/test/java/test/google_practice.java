package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class google_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.google.com/");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//input[@class='gsfi'][@title='Search']")).sendKeys("Bangladesh");
		
		WebElement googleSearch = dr.findElement(By.xpath("//input[@class='gsfi'][@title='Search']"));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		googleSearch.sendKeys(Keys.TAB);//
		dr.findElement(By.xpath("//input[@name='btnK']")).click();
		
		WebDriverWait wait = new WebDriverWait(dr,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Bangladesh - Wikipedia']")));
		if(dr.findElement(By.xpath("//a[text()='Bangladesh - Wikipedia']")).isDisplayed()) {
			System.out.println("Bangladesh Displayed!!");
		}else {
			System.out.println("Bangladesh doesn't displayed");
		}

		
	}

}
