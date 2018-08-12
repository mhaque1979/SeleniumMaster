package revisions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class utility {
	
		public static WebDriver dr = opencloseBR.dr;
		
		public static void click (String xpath) {
			
			dr.findElement(By.xpath(xpath)).click();
		}
		
		public static void typing(String xpath, String keys) {
			
			dr.findElement(By.xpath(xpath)).sendKeys(keys);
		}

}
