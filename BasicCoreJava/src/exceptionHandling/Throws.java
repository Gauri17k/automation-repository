package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {

	public static void main(String[] args) {
		
		divide(10,0);
		try {
			readdata(" ");
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static void readdata(String filepath) throws FileNotFoundException {
		
		FileInputStream file= new FileInputStream(filepath);
		
	}
	
	public static void divide(int a,int b) throws ArithmeticException
	{
		System.out.println(a/b);
	}

}
