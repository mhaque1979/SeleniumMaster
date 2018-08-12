package my_tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functionLibrary.Constant;

public class excel_Practice {

	public static void main(String[] args) throws IOException  {
		
		// need to get sheet first

	Sheet	mysheet = excel_util.getSheet(Constant.testDatalocation+ "newtown.xlsx", "Sheet1");
	
	String mydata = excel_util.getCellData(mysheet, 0, 0);
	System.out.println( excel_util.getCellData(mysheet, 1, 1));
	
	System.out.println(mydata);
		
		
		
	}
}			