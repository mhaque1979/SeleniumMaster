package my_tests;

import org.openqa.selenium.By;

import z_Func_Library.*;

public class newTour_with_my_functionLib {

	public static void main(String[] args) {
		
		my_openBrowser.openBrowser("Chrome", "http://newtours.demoaut.com/");
		my_Function.typesomething(By.name("userName"), ("ufttest01"));
		my_Function.typesomething(By.name("password"), ("1234uft1"));
		my_Function.clickObject(By.xpath("//input[@name='login']"));

	}

}
