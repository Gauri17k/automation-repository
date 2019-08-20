package exceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		int a=10,b=0;
		
		try
		{
		
		System.out.println(a/b);
		}
		catch (Exception e)
		{
			System.out.println("Exception occured");
			
			System.out.println(e.getMessage());
			e.printStackTrace();  // print error block
			
			
		}
		System.out.println("gauri");

	}

}
