package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//C:\Users\Tamzid\Documents\SeleniumTestData.xlsx
		
		File datafile = new File("C://Users//Tamzid//Documents//SeleniumTestData.xlsx");
		//Load file
		FileInputStream fis=new FileInputStream(datafile);
		
		//load workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		System.out.println(wb.getNumberOfSheets());
		//get / load specific worksheet
		XSSFSheet sheet = wb.getSheet("Sheet5");
//		XSSFSheet sheet = wb.getSheetAt(0);
/*		
		//grt total row number
		System.out.println(sheet.getLastRowNum()+1);

		//get number of column for row #1
		System.out.println(sheet.getRow(0).getLastCellNum());
		
		System.out.println(sheet.getRow(1).getLastCellNum());
		
		System.out.println(sheet.getRow(2).getLastCellNum());
		
		System.out.println(sheet.getRow(3).getLastCellNum());
		
		
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());*/
		//System.out.println(sheet.getRow(4).getLastCellNum());
		
		int rownum;
		int colnum;
		rownum=sheet.getLastRowNum();
		
		// Read Value from excel
/*		for(int i=0;i<rownum+1; i++) {
			Row r = sheet.getRow(i);
			//colnum=sheet.getRow(i).getLastCellNum();
			colnum=r.getLastCellNum();
			for(int j=0;j<colnum; j++) {
				String cellValue=r.getCell(j,r.CREATE_NULL_AS_BLANK).getStringCellValue();
				System.out.println(cellValue);
				
				
				
			}
		}*/
		
		//iterator...
		
		//Write value in excel
		
/*		for(int i=1; i < rownum+1; i++) {
			Row row=sheet.getRow(i);
			colnum=row.getLastCellNum();
			int res=0;
			for(int j = 0; j<colnum ; j++) {
				int xx = (int) row.getCell(j).getNumericCellValue();
				res=res+xx;
				//Cell c=row.createCell(colnum-1);
				//c.setCellValue("USA");
			}
			
			
			Cell c = row.createCell(colnum);
			c.setCellValue(Integer.toString(res));
			
		}*/
		
		for(int i=1; i < rownum+1; i++) {
			Row row=sheet.getRow(i);
			colnum=row.getLastCellNum();
			String res="";
			for(int j = 0; j<colnum ; j++) {
				String xx = row.getCell(j).getStringCellValue();
				res=res+xx+" ";
				//Donal Trump 
				//Cell c=row.createCell(colnum-1);
				//c.setCellValue("USA");
			}
			
			System.out.println(res);
			Cell c = row.createCell(colnum);
			c.setCellValue(res.trim());
			
		}
		
		fis.close();
		
		//to write data in excel..
		//open file in write mode..
		FileOutputStream fos = new FileOutputStream(datafile);
		
		wb.write(fos);
		fos.close();
	}

}
