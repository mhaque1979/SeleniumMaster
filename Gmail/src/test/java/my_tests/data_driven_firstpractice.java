package my_tests;
import java.io.File;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import functionLibrary.Constant;
import z_Func_Library.excel_func;

public class data_driven_firstpractice {

	public static void main(String[] args) throws IOException {
		
		XSSFSheet dataSheet = (XSSFSheet) excel_func.getSheet( (Constant.testDatalocation+"newtown.xlsx"), "Sheet1");
		String myData = excel_func.getCellData(dataSheet, 0, 0);

		System.out.println(myData);


	}

}
