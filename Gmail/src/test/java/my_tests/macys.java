package my_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class macys {
	public static WebDriver dr;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src//Driver//chromedriver.exe");
		dr = new ChromeDriver ();
		dr.get("https://www.macys.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



		WebElement element = dr.findElement(By.xpath("//Span[@id='shopByDepartmentLabelText']"));
		element.click();
		dr.findElement(By.xpath("//*[@id=\"flexid_1\"]")).click();
		
	}

}
