package fileHandler;

import java.io.IOException;

public class TestXls_Reader {

	public static void main(String[] args) throws IOException {

		Xls_Reader x= new Xls_Reader("D:\\automation-repository\\BasicCoreJava\\src\\fileHandler\\TestNG.xls");
		
		int rows=x.getRowCount("sheet1");
		
		int cols=x.getColCount("sheet1");
		
		System.out.println(rows);
		
		System.out.println(x.getColCount("sheet1"));
		
	
    for( int r=1;r<=rows;r++)
    {
    	for(int c=1;c<=cols;c++)
    	{
    		
    	//	System.out.println(x.getCellData("sheet1", r, c));
    		
    		System.out.print(x.getCellData("sheet1", r, c)+" ");
    	
    	}System.out.println("");
    }
}
}
