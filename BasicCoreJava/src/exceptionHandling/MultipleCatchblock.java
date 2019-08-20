package exceptionHandling;

import java.io.FileInputStream;

public class MultipleCatchblock {

	public static void main(String[] args) {
	
//step 1
		try {
			
			//System.out.println(10/0);
			
		System.out.println(10/10);
		
		//step2
		
		
		String str="gauri";
		
		System.out.println(str.charAt(6));
		//step 3
		
		System.out.println("step3");
		
		//step4
		
		FileInputStream file=new  FileInputStream(" ");
		
		//step 5
		
		int[] arr= {};
		System.out.println(arr[0]);
		}
		catch (ArithmeticException e)
		{
			System.out.println("handle ArithmeticException exceptn");
		}
		
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println(" handle StringIndexOutOfBoundsException");
		}
		
		catch(Exception e){
			
			System.out.println(e.getMessage());
			e.printStackTrace(); 
		}
	}

}
