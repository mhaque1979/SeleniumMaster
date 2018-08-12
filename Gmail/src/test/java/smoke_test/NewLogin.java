package smoke_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionLibrary.LogClass;
import functionLibrary.OpenCloseBrowser;
import functionLibrary.SWD_Function;

public class NewLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogClass.startTestCase("NewLogin");
		OpenCloseBrowser.openBrowser("Chrome", "http://newtours.demoaut.com/");
		SWD_Function.typeValue(By.name("userName"),("ufttest01"));
		SWD_Function.typeValue(By.name("password"), "1234uft1");
		SWD_Function.clickObject(By.xpath("//input[@name='login']"));
		SWD_Function.waitForObjectDisplay(By.name("findFlights"));
		SWD_Function.clickObject(By.xpath("//input[@value='oneway']"));
		SWD_Function.selectByIndex(By.name("passCount"), 2);
		SWD_Function.selectByValue(By.name("fromPort"), "New York");
	//	OpenCloseBrowser.closeBrowser();
	}

}
