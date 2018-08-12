package my_tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import functionLibrary.Constant;
import functionLibrary.ExcelUtility;

public class DataDriven_Login_Newtour {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver mydr;
		
		XSSFSheet dataSheet=(XSSFSheet) ExcelUtility.getSheet(Constant.testDatalocation+"newtown.xlsx","Sheet1");
		int row_num=ExcelUtility.getRowCount(dataSheet);
		for(int i=1;i<row_num+1;i++) {
			String user_name=ExcelUtility.getCellData(dataSheet, i, 0);
			String passwd=ExcelUtility.getCellData(dataSheet, i, 1);
			System.setProperty("webdriver.chrome.driver", "src\\Driver\\chromedriver.exe");
			mydr = new ChromeDriver ();
			mydr.get("http://newtours.demoaut.com/");
			mydr.manage().window().maximize();
			mydr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			mydr.findElement(By.name("userName")).sendKeys(user_name.trim());
			mydr.findElement(By.name("password")).sendKeys(passwd.trim());
			mydr.findElement(By.name("login")).click();
			
			if(mydr.findElements(By.xpath("//input[@value='oneway']")).size()>0) {
				ExcelUtility.setCellValue(dataSheet, i, 2, "PASS",Constant.testDatalocation+"newtown.xlsx");
			}else {
				ExcelUtility.setCellValue(dataSheet, i, 2, "FAIL",Constant.testDatalocation+"newtown.xlsx");
			}
			mydr.quit();
			System.out.println(i + "st time login...");
			
			//ExcelUtility.setCellValue(dataSheet, i, 2, "PASS",Constant.testDataloca+"newtown.xlsx");
		}


	}

}
