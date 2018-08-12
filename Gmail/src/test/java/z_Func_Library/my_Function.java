package z_Func_Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class my_Function {
	
	public static WebDriver mydr = my_openBrowser.mydr;
	
	
	
	public static void clickObject (final By propertyvalue) {
		
		mydr.findElement(propertyvalue).click();}	
	public static void typesomething (final By propertyvalue, String inputvalue) {
		
		mydr.findElement(propertyvalue).sendKeys(inputvalue);
	}
	public static void selectSomething (final By propertyvalue) {
		
		if(mydr.findElement(propertyvalue).isSelected()!= true) {
			mydr.findElement(propertyvalue).click();
		}
	}
	public static void deselectSomething (final By propertyvalue) {
		
		if(mydr.findElement(propertyvalue).isSelected()== true) {
			mydr.findElement(propertyvalue).click();
		}
	}
	public static void selectbyValue (final By propertyvalue, String selectValue) {
		
		WebElement element = mydr.findElement(propertyvalue);
		Select select = new Select (element);
		select.selectByValue(selectValue.trim());
	}
	public static void selectbyText (final By propertyvalue, String selectText) {
		
		WebElement element = mydr.findElement(propertyvalue);
		Select select = new Select (element);
		select.selectByVisibleText(selectText.trim());
	}
	public static void selectbyIndex (final By propertyvalue, int selectIndex ) {
		
		WebElement element = mydr.findElement(propertyvalue);
		Select select = new Select (element);
		select.selectByIndex(selectIndex);
	}
	



}
