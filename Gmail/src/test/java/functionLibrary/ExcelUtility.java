package functionLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static XSSFWorkbook wb;

	public static Sheet getSheet(String fileName, String sheetName) throws IOException {
		XSSFSheet sheet=null;
		//File file = new File(Constant.testDatalocation+fileName);
		try {
			File file = new File(fileName);
			FileInputStream fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(sheetName);
		}catch(Exception e) {
			e.getMessage();
		}
		return sheet;
	}

	public static int getRowCount(Sheet sheet) {
		int rownum=0;
		try {
			rownum=(sheet.getLastRowNum());
		}catch(Exception e) {
			e.getMessage();
		}
		return rownum;
	}

	public static String getCellData(Sheet sheet, int rowNum, int cellNum) {
		String data=null;
		try {
			Row row =sheet.getRow((rowNum));
			data=row.getCell((cellNum), row.CREATE_NULL_AS_BLANK).getStringCellValue();
		}catch(Exception e) {
			e.getMessage();
		}
		return data;
	}

	public static void setCellValue(XSSFSheet sheet, int rowNum, int colNum, String data, String filePath) throws IOException {
		try {
			Row row= sheet.getRow(rowNum);
			Cell cell = row.createCell(colNum);
			cell.setCellValue(data.trim());
			FileOutputStream fos = new FileOutputStream(filePath);
			wb.write(fos);
			fos.close();
		}catch(Exception e) {
			e.getMessage();
		}


	}


	
	// this is how all the methods were called
	/*	public static void main(String[] args) throws IOException {
		XSSFSheet sh;
		try {
			sh = (XSSFSheet) getSheet(Constant.testDataloca+"newtown.xlsx","Sheet1");
			int a=getRowCount(sh);
			String uname=getCellData(sh, 2, 1);
			System.out.println(uname);
		}catch(Exception e) {
			e.getMessage();
		}
	}*/
}
