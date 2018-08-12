/**
 * 
 */
package functionLibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Tamzid
 *
 */
public class SWD_Function {

	public static WebDriver driver=OpenCloseBrowser.driver;
	private static Logger swd = Logger.getLogger(SWD_Function.class);

	public static void clickObject(final By propertyValue) {
		try {
			Thread.sleep(100);
			driver.findElement(propertyValue).click();
			swd.info("PASS.. <" + propertyValue + "> clicked successfully.");
		}catch(Exception e) {
			//e.printStackTrace();
			swd.error("FAIL..");
		}
	}
	
	

	
	
	public static void typeValue(final By propertyValue,String inputValue) {
		try {
			driver.findElement(propertyValue).sendKeys(inputValue);
			swd.info("PASS.. <" + inputValue + "> typed successfully into <" + propertyValue + ">");
		}catch(Exception e) {
			//e.printStackTrace();
			swd.error("FAIL..");
		}
	}
	

	
	
	
	public static void waitForObjectDisplay(final By propertyValue) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(propertyValue));
			swd.info("PASS.. Object <" + propertyValue + " displayed");
		}catch(Exception e) {
			swd.error("FAIL.. Object <" + propertyValue + "> doesn't display within 30 sec");
		}
	}
	
	public static void waitForObjectLoad(final By propertyValue) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.presenceOfElementLocated(propertyValue));
			swd.info("PASS.. Object <" + propertyValue + " displayed");
		}catch(Exception e) {
			swd.error("FAIL.. Object <" + propertyValue + "> doesn't display within 30 sec");
		}
	}
	
	
	public static void waitForObjectClickable(final By propertyValue) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(propertyValue));
			swd.info("PASS.. Object <" + propertyValue + " clickable");
		}catch(Exception e) {
			swd.error("FAIL.. Object <" + propertyValue + "> state was not change within 30 sec");
		}
	}
	
	public static void selectChkBox(final By propertyValue) {
		try {
			if(driver.findElement(propertyValue).isSelected()!=true) {
				driver.findElement(propertyValue).click();
				swd.info("<" + propertyValue + "> select successfully");
			}
				
		}catch(Exception e) {
			swd.error(e.fillInStackTrace());
		}
	}
	
	public static void deSelectChkBox(final By propertyValue) {
		try {
			if(driver.findElement(propertyValue).isSelected()==true) {
				driver.findElement(propertyValue).click();
				swd.info("<" + propertyValue + "> deselect successfully");
			}
				
		}catch(Exception e) {
			
		}
	}
	
	
	public static void selectByValue(final By propertyValue, String selectValue) {
		try {
			WebElement element=driver.findElement(propertyValue);
			Select select = new Select (element);
			select.selectByValue(selectValue.trim());
			swd.info("PASS..<" + selectValue + "> select from <"+ propertyValue + "> dropdown");
		}catch(Exception e) {
			swd.error("unable to select <" + selectValue + "> select from <"+ propertyValue + "> dropdown");
		}
	}
	
	
	public static void selectByText(final By propertyValue, String selectValue) {
		try {
			WebElement element=driver.findElement(propertyValue);
			Select select = new Select (element);
			select.selectByVisibleText(selectValue.trim());
			swd.info("PASS..<" + selectValue + "> select from <"+ propertyValue + "> dropdown");
		}catch(Exception e) {
			swd.error("unable to select <" + selectValue + "> select from <"+ propertyValue + "> dropdown");
		}
	}
	
	public static void selectByIndex(final By propertyValue, int indexNumber) {
		try {
			WebElement element=driver.findElement(propertyValue);
			Select select = new Select (element);
			select.selectByIndex(indexNumber);
			swd.info("PASS..<" + indexNumber + "> index item select from <"+ propertyValue + "> dropdown");
		}catch(Exception e) {
			swd.error("unable to select <" + indexNumber + "> index item  select from <"+ propertyValue + "> dropdown");
		}
	}

	public static void handlePopup(String typeOfAction) {
		if(typeOfAction.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}else if(typeOfAction.equalsIgnoreCase("Dismiss")) {
			driver.switchTo().alert().dismiss();
		}else if(typeOfAction.equalsIgnoreCase("ESC")) {
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ESCAPE);
		}
	}
	
}

//TestNG... Anotation based
