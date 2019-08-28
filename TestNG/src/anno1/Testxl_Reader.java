package anno1;

import java.io.IOException;

public class Testxl_Reader {

	public static void main(String[] args) throws IOException {
		xlreader x1= new xlreader("D:\\automation-repository\\TestNG\\src\\anno1\\g.xls");
		
		int rows=x1.getRowCount("Sheet1");
		
		int cell=x1.getCellCount("Sheet1");
		
		System.out.println(rows);
		
		System.out.println(x1.getCellCount("Sheet1"));
		

	}

}
