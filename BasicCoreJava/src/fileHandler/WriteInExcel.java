package fileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteInExcel {

	public static void main(String[] args) throws IOException {
		String filpath="D:\\automation-repository\\BasicCoreJava\\src\\fileHandler\\TestNG.xls";
		
		FileInputStream file= new FileInputStream(filpath);
		
		HSSFWorkbook wb= new HSSFWorkbook(file);// workbook
		
		wb.getSheet("Sheet1");
		
		HSSFSheet sheet = wb.getSheet("Sheet1");  // sheet
		
		HSSFRow row= sheet.getRow(11);// row
		
		if (row==null)
		{
			row=sheet.createRow(11);
		}
		
	
		HSSFCell cell= row.getCell(0);// cell
		
		if (cell==null)
		{
			cell=row.createCell(2);
		}
		
		cell.setCellValue("gauri");
		
		FileOutputStream fileOut = new FileOutputStream(filpath);
		
		wb.write(fileOut);

	}

}
