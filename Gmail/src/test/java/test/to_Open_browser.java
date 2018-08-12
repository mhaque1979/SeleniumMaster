package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

//import com.sun.deploy.association.Action;

import functionLibrary.*;
public class to_Open_browser {

	public  static void main (String [] args) throws InterruptedException, AWTException {

		WebDriver dr;
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");

		dr = new ChromeDriver (option);
		dr.get("https://www.jobstreet.com");
		dr.manage().window().maximize();

		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//interview question

		//implicitlyWait...conditional wait
		//ExplicitlyWait .. hrad wait
		
		

/*		
		//Move mouse action
		WebElement singapore=dr.findElement(By.xpath("//a[text()='Singapore']"));
		Actions act = new Actions(dr);
		act.moveToElement(singapore).click().build().perform();
		*/
		
		//Move mouse physically
		
		WebElement singapore=dr.findElement(By.xpath("//a[text()='Singapore']"));
		Actions act = new Actions(dr);
		Point coordinate=singapore.getLocation(); // (12,45)
		int xaxis=coordinate.getX();
		int yaxis=coordinate.getY();
	//	act.moveToElement(singapore, xaxis, yaxis).click().build().perform();
		
		Robot robo = new Robot();
		robo.mouseMove(xaxis, yaxis);
		act.moveToElement(singapore).click().build().perform();
		singapore.click();
		
		if(dr.findElement(By.xpath("//div[@class='carousel-title']/button[text()='Free Sign Up']")).isDisplayed()) {
			Thread.sleep(2000);
			dr.findElement(By.xpath("//div[@class='carousel-title']/button[text()='Free Sign Up']")).click();
			System.out.println("Object displayed");
		}else {
			System.out.println("Object doesn't displayed");
		}

/*		if(dr.findElement(By.xpath("//*[@id='promotion']")).isDisplayed()) {
			boolean res=dr.findElement(By.xpath("//*[@id='promotion']")).isSelected();
			System.out.println(res);
		}*/
		
		//to select any checkbox
		
/*		if(dr.findElement(By.xpath("//*[@id='promotion']")).isSelected()) {
			System.out.println("Checkbox already selected");
		}else {
			dr.findElement(By.xpath("//*[@id='promotion']")).click();
		}*/
		
		if (dr.findElement(By.xpath("//*[@id='promotion']")).isSelected()!=true){
			dr.findElement(By.xpath("//*[@id='promotion']")).click();	
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
		}else {
			System.out.println("Object pre selected");
		}
		
		
		//to unselct any checkbox
		
		if (dr.findElement(By.xpath("//*[@id='promotion']")).isSelected()==true){
			Thread.sleep(1000);
			dr.findElement(By.xpath("//*[@id='promotion']")).click();		
		}
		
		
		
		
				
		/*		LogClass.startTestCase("to_Open_browser");
		OpenCloseBrowser.openBrowser("chrome", "https://www.jobstreet.com");
		SWD_Function.clickObject(By.xpath("//a[text()='Singapore']"));
		SWD_Function.waitForObjectClickable(By.xpath("//div[@class='carousel-title']/button[text()='Free Sign Up']"));
		Thread.sleep(1000);
		SWD_Function.clickObject(By.xpath("//div[@class='carousel-title']/button[text()='Free Sign Up']"));
		 */
		//mouse control..

/*		if(dr.findElement(By.xpath("//div[@class='carousel-title']/button[text()='Free Sign Up']")).isDisplayed()) {
			Actions mouseHover=new Actions(dr);
			WebElement signup=dr.findElement(By.xpath("//div[@class='carousel-title']/button[text()='Free Sign Up']"));
			
			mouseHover.moveToElement(signup).build();
			mouseHover.click().build()
		}*/

	}

}
