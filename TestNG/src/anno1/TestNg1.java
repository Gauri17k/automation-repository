package anno1;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basicAnnotations.Xls_Reader;

public class TestNg1 {
	
	@Test(dataProvider="getData2")
	
	public void  logicTestCase(String username, String password) 
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider 
	public String[][] getData() throws IOException
	{
		  Xls_Reader x= new Xls_Reader("D:\\\\automation-repository\\\\TestNG\\\\src\\\\anno1\\\\g.xls");
			
			int rows=x.getRowCount("sheet1");
			
			int cols=x.getColCount("sheet1");
			
			String[][] data= new String[rows][cols];
			
			System.out.println(rows);
			
			System.out.println(x.getColCount("sheet1"));
			
		
	    for( int r=1;r<=rows;r++)
	    {
	    	for(int c=1;c<=cols;c++)
	    	{
	    		
	    	System.out.println(x.getCellData("sheet1", r, c));
	    	}
	    }
	    
	  /*  data [0][0]="user1";
		data[0][1]="password1";
		
		//row2
		data [1][0]="user2";
		data[1][1]="password2";
		
		//row3
		data [2][0]="user3";
		data[2][1]="password3";
	    return data;*/
	    
	    //@DataProvider   
		
		/*public String[][] getData2()
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
		}*/
	    
	    
	    
	}

}
