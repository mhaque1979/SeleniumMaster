package smoke_test;

import org.testng.annotations.Test;

import functionLibrary.LogClass;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class TestNG_Test {
	public WebDriver dr;
	@BeforeTest
	public void beforeTest() {
		//System.setProperty("", "");
/*		dr=new ChromeDriver();
		dr.get("");*/
		System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("http://newtours.demoaut.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@Test
	public void f() {
		dr.findElement(By.name("userName")).sendKeys("ufttest01");
		dr.findElement(By.name("password")).sendKeys("1234uft1");
		LogClass.pass("PASS...password entered..");
		dr.findElement(By.name("login")).click();
		LogClass.pass("PASS... Login clicked ..");
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		WebElement passselect=dr.findElement(By.xpath("//select[@name='passCount']"));
		Select selectPAss=new Select(passselect);
		selectPAss.selectByValue("2");
	}


	@AfterTest
	public void afterTest() {
		dr.quit();
		
		//tear down
	}
	

}
