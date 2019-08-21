package fileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
	String filpath="D:\\automation-repository\\BasicCoreJava\\src\\fileHandler\\TestNG.xls";
	
	FileInputStream file= new FileInputStream(filpath);
	
	HSSFWorkbook wb= new HSSFWorkbook(file);// workbook
	
	wb.getSheet("Sheet1");
	
	HSSFSheet sheet = wb.getSheet("Sheet1");  // sheet
	
	HSSFRow row= sheet.getRow(1);// row
	
	HSSFCell cell= row.getCell(0);// cell
	
	String value= cell.getStringCellValue();
	
	System.out.println(value);
	
	

	}

}
