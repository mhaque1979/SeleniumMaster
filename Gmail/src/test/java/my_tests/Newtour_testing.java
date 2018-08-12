package my_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import functionLibrary.SWD_Function;





public class Newtour_testing {
	

	
	public static void main (String [] args) {
		
		WebDriver mydr;
		System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
		
		mydr = new ChromeDriver ();
		
		mydr.get("http://newtours.demoaut.com/");
		
		mydr.manage().window().maximize();
		mydr.findElement(By.name("userName")).sendKeys("ufttest01");
		mydr.findElement(By.name("password")).sendKeys("1234uft1");
		mydr.findElement(By.name("login")).click();
		
		// 2nd page
		
		mydr.findElement(By.xpath("//input[@value='oneway']")).click();
		
		// to select from  list
		
		
		WebElement pslect = mydr.findElement(By.xpath("//select[@name='passCount']"));
		Select passLect = new Select (pslect);
		passLect.selectByValue("3");
		
		
		WebElement port = mydr.findElement(By.name("fromPort"));
		Select fromPort = new Select (port);
		fromPort.selectByValue("Paris");
		
		WebElement monTH = mydr.findElement(By.name("fromMonth"));
		Select fromMonTH = new Select (monTH);
		fromMonTH.selectByValue("2");
		
		
		WebElement fromDay = mydr.findElement(By.name("fromDay"));
		Select Day = new Select (fromDay);
		Day.selectByValue("3");
		
		WebElement toPort = mydr.findElement(By.name("toPort"));
		Select destination = new Select (toPort);
		destination.selectByValue("London");
		
		
		 WebElement toMonth = mydr.findElement(By.name("toMonth"));
		 Select returning = new Select (toMonth);
		 returning.selectByValue("4");
		 
		
		
		
		
		
		
		
		
		
	}

}
