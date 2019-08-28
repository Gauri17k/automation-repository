package anno1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class xlreader {
	
	String filepath=null;
	
	public xlreader(String filepath)
	{
		this.filepath=filepath;
	}
	
	public String getCell(String sheetname,int rownum,int cellnum) throws IOException
	{
		FileInputStream file= new FileInputStream(filepath);
		
		HSSFWorkbook wb= new HSSFWorkbook (file);
		
		HSSFSheet sheet= wb.getSheet(sheetname);
		
		HSSFRow row= sheet.getRow(rownum-1);
		
		HSSFCell cell = row.getCell(cellnum-1);
		
		String value=cell.getStringCellValue();
		return value;
		
		}
	
	public void setCellData(String sheetname,int rownum,int cellnum,String value) throws IOException
	{
		
FileInputStream file= new FileInputStream(filepath);
		
		HSSFWorkbook wb= new HSSFWorkbook(file);// workbook
		
		
		
		HSSFSheet sheet = wb.getSheet(sheetname);  // sheet
		
		HSSFRow row= sheet.getRow(rownum-1);// row
		
		if(row==null)
		{
			row= sheet.createRow(rownum-1);
		}
		
		HSSFCell cell = row.getCell(cellnum-1);
		
		
		if (cell==null)
		{
			cell= row.getCell(cellnum);
		}
		cell.setCellValue(value);
		
		FileOutputStream fileOut = new FileOutputStream(filepath);
		wb.write(fileOut);
	}
	
	public int getRowCount(String sheetname) throws IOException
	
	{
		  FileInputStream file= new FileInputStream(filepath);
			
		HSSFWorkbook wb= new HSSFWorkbook(file);// workbook
	
	 HSSFSheet sheet = wb.getSheet(sheetname);  // sheet
	
	return sheet.getLastRowNum()+1;		
	}
	
	public int getCellCount(String sheetname) throws IOException
	{
		 FileInputStream file= new FileInputStream(filepath);
			
			HSSFWorkbook wb= new HSSFWorkbook(file);
			
			HSSFSheet sheet = wb.getSheet(sheetname);
			
			return  sheet.getRow(0).getLastCellNum();
			
			
			
	}
}
