package my_tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.rowset.internal.Row;

public class excel_util {

	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;

	public static Sheet getSheet (String fileName, String sheetName) throws IOException {
		sheet = null;
		try {	
			File file = new File (fileName);
			FileInputStream fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(sheetName);
		} catch (Exception e) {
			e.getMessage();
		}
		return sheet;
	}

	public static String getCellData ( Sheet sheet, int rownum, int cellnum) {

		String data = null;
		try {
			org.apache.poi.ss.usermodel.Row row = sheet.getRow(rownum);
			data = row.getCell(cellnum, row.CREATE_NULL_AS_BLANK).getStringCellValue();
		}catch (Exception e) {
			e.getMessage();
		}
		return data;
	}



}


//}
