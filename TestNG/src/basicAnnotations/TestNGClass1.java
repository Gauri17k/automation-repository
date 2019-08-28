package basicAnnotations;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGClass1 {

	@Test(dataProvider="getData2")     /// to pass below row data
	
/*	public void test1() {
		System.out.println("testing");
	}*/
	
	public void  logicTestCase(String username, String password) 
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider                  /// to pass below row data - to execute with multiple data set
	
	public String[][] getData() throws IOException
	{
        Xls_Reader x= new Xls_Reader("D:\\automation-repository\\TestNG\\src\\basicAnnotations\\TestNG.xls");
		
		int rows=x.getRowCount("sheet1");
		
		int cols=x.getColCount("sheet1");
		
		String[][] data= new String[rows][cols];
		
		System.out.println(rows);
		
		System.out.println(x.getColCount("sheet1"));
		
	
    for( int r=1;r<=rows;r++)
    {
    	for(int c=1;c<=cols;c++)
    	{
    		
    	//	System.out.println(x.getCellData("sheet1", r, c));
    		
    		//System.out.print(x.getCellData("sheet1", r, c)+" ");
    		
    		data[r-1][c-1]=x.getCellData("sheet1", r, c); 
    		
    	
    	}System.out.println("");
    }
		
		
		
	/*
		//row 1
		
		data [0][0]="user1";
		data[0][1]="password1";
		
		//row2
		data [1][0]="user2";
		data[1][1]="password2";
		
		//row3
		data [2][0]="user3";
		data[2][1]="password3";
		*/
	
		return data;
	}
	
	@DataProvider   
	
	public String[][] getData2()
	{
		String[][] data= new String[3][2];
		//row 1
		
		data [0][0]="user1";
		data[0][1]="password1";
		
		//row2
		data [1][0]="user2";
		data[1][1]="password2";
		
		//row3
		data [2][0]="user3";
		data[2][1]="password3";
		
	
		return data;
	}
}
