package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import FuntionLib_WD.*;
public class New_Driver {
	//public static WebDriver dr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver poly = null;
		
		//FunctionLib
		poly=OpenCloseBrowser.openBrowser(poly, "chrome", "https://www.jobstreet.com");	
				
		SWD_Functions.clickObject(poly, By.xpath("//a[@id='singapore']"));
		//SWD_Function.clickObject(dr, By.xpath("//a[text()='Singapore']"));
		
		//Alert alt = new Alert();
		//poly.switchTo().alert().
		//poly.switchTo().parentFrame()
		
	}

}
