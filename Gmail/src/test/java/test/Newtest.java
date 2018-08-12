package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println("Hi");
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://newtours.demoaut.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(1000);
/*		dr.findElement(By.name("userName")).clear();
		dr.findElement(By.name("userName")).sendKeys("fgsjhdfsjhdj");*/
		dr.findElement(By.xpath("//input[@name='userName']")).clear();
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("ufttest01");
		dr.findElement(By.name("password")).sendKeys("1234uft1");
		
		

		
		String fare= dr.findElement(By.xpath("//font[contains(text(),'Atlanta')]/../following-sibling::td//b")).getText();
		System.out.println(fare);
		
		if(fare.contentEquals("$398")) {
			System.out.println("Result matched");
		}else {
			System.out.println("Result Mismatch!!");
		}
		
		String fare1= dr.findElement(By.xpath("//font[contains(text(),'Boston')]/../following-sibling::td//b")).getText();
		System.out.println(fare1);
		
		if(fare1.contentEquals("$514")) {
			System.out.println("Result matched");
		}else {
			System.out.println("Result Mismatch!!");
		}
		
		
		String face_val= dr.findElement(By.xpath("//font[contains(text(),'Boston')]/../following-sibling::td//font")).getAttribute("face");
		System.out.println(face_val);
		
/*		if(fare1.contentEquals("$514")) {
			System.out.println("Result matched");
		}else {
			System.out.println("Result Mismatch!!");
		}*/
		String fare2= dr.findElement(By.xpath("//font[contains(text(),'Angeles')]/../following-sibling::td//b")).getText();
		System.out.println(fare2);
		
		if(fare2.contentEquals("$200")) {
			System.out.println("Result matched");
		}else {
			System.out.println("Result Mismatch!!");
		}
		
		
		dr.quit();
		//dr.findElement(By.name("login")).click();
	}

}
