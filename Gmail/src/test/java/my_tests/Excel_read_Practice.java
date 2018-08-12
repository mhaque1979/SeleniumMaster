package my_tests;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




// excelFilePath..filename; sheetname



public class Excel_read_Practice {

	public static void main(String[] args) throws IOException  {
		
		// To access a File -> Workbook -> Sheet  line 26 to 30
		
		File myFile = new File ("C:\\Users\\Tamzid\\Desktop\\Selenium\\newtown.xlsx");
		FileInputStream fish = new FileInputStream (myFile);
		XSSFWorkbook mywb = new XSSFWorkbook(fish);
		
		XSSFSheet sheet = mywb.getSheetAt(0);
		
		// to get cell value  line 34 to 44
		// If I set i =1 on line 39 than the header row will not be counted
		
		int rowNumber, colNumber;
		
		rowNumber = sheet.getLastRowNum();
		
		for(int i=0;i<rowNumber+1; i++) {
			Row r = sheet.getRow(i);
			colNumber=r.getLastCellNum();
			
			for(int j=0;j<colNumber; j++) {
				String cellV=r.getCell(j,r.CREATE_NULL_AS_BLANK).getStringCellValue();
				System.out.println(cellV);}}

		
		
		
		// To get total row number
		
		System.out.println("Total number of rows are: " +  (sheet.getLastRowNum()+1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
