package FuntionLib_WD;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class SWD_Functions {
	private static Logger swd = Logger.getLogger(SWD_Functions.class);
	public static void clickObject(WebDriver zubair, final By propertyValue) {
		try {
			Thread.sleep(100);
			System.out.println(zubair.findElements(propertyValue).size());
			zubair.findElement(propertyValue).click();
			swd.info("PASS.. <" + propertyValue + "> clicked successfully.");
		}catch(Exception e) {
			e.printStackTrace();
			swd.error("FAIL..");
		}
	}


	public static void typeValue(WebDriver dr,final By propertyValue,String inputValue) {
		try {
			dr.findElement(propertyValue).sendKeys(inputValue);
			swd.info("PASS.. <" + inputValue + "> typed successfully into <" + propertyValue + ">");
		}catch(Exception e) {
			//e.printStackTrace();
			swd.error("FAIL..");
		}
	}

}
