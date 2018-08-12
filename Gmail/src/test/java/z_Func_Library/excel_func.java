package z_Func_Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_func {

	public static XSSFWorkbook wb;

	// To access a sheet from excel

	public static  Sheet getSheet (String filename, String SheetName) throws IOException {

		XSSFSheet sheet=null;

		try {
			File file = new File (filename);
			FileInputStream fis = new FileInputStream (file);
			wb = new XSSFWorkbook (fis);
			sheet = wb.getSheet(SheetName);
		} catch(Exception e) {
			e.getMessage();}



		return sheet;
	}


public static String getCellData(Sheet sheet, int rowNum, int cellNum) {
	String data=null;
	Row row = sheet.getRow(rowNum);
	data = row.getCell(cellNum, row.CREATE_NULL_AS_BLANK).getStringCellValue();
	return data;
}



}