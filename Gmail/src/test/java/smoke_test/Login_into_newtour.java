package smoke_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import functionLibrary.LogClass;

public class Login_into_newtour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogClass.startTestCase("Login_into_newtour");
		WebDriver driver;
		//for chrome browser
		System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("username")).sendKeys("ufttest01");
		
/*		if(driver.findElement(By.name("userName")).isDisplayed()) {
			if(driver.findElement(By.name("userName")).isEnabled()) {
				driver.findElement(By.name("userName")).sendKeys("ufttest01");
				LogClass.pass("PASS...user name entered..");
			}else {
				System.out.println("User name displayed but disable!!");
			}
		}else {
			System.out.println("User Name doesn't displayed!!");
			
		}*/
		
		
		driver.findElement(By.name("passworda")).sendKeys("1234uft1");
		LogClass.pass("PASS...password entered..");
		driver.findElement(By.name("login")).click();
		LogClass.pass("PASS... Login clicked ..");
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		WebElement passselect=driver.findElement(By.xpath("//select[@name='passCount']"));
		Select selectPAss=new Select(passselect);
		selectPAss.selectByValue("2");
		//selectPAss.
		
		//Select selectPAss=new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		
		WebElement depart=driver.findElement(By.name("fromPort"));
		Select portFrom = new Select(depart);
		portFrom.selectByVisibleText("Frankfurt");
		
		LogClass.endTestCase("Login_into_newtour");
		//
		
/*		//check any checkbox
		if(driver.findElement(By.name("ticketLess")).isSelected()) {
			
		}else {
			driver.findElement(By.name("ticketLess")).click();
		}
				
		//uncheck any checkbox
		if(driver.findElement(By.name("ticketLess")).isSelected()) {
			driver.findElement(By.name("ticketLess")).click();
		}else {
			//driver.findElement(By.name("ticketLess")).click();
		}
*/
					
		
		//log
		driver.quit();
	}
	
	//iframe
	//selectWindow
	//popup/alert


}
