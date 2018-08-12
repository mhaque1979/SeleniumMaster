package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_practice2 {

	public static void main(String[] args) throws IOException {
	
		
				File file = new File ("C:\\Users\\Tamzid\\Desktop\\Selenium\\practice1.xlsx\\");
				FileInputStream fis = new FileInputStream (file);
				XSSFWorkbook wb = new XSSFWorkbook (fis);
				XSSFSheet mysheet = wb.getSheetAt(0);
				
				int rownum = 0;
				XSSFRow x =mysheet.getRow(rownum);
				
				int y = x.getLastCellNum();
				
				System.out.println(y);
				

	}

}
