package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception{
	
		eligibility(60);
	}
	
	public static void eligibility(int age) throws Exception{
		
		if(age>18 && age<30)
		{
			System.out.println("eligible for gov exam");
		}
		else
		{
			throw new Exception ("you are not eligible");
			
		}
		
	}

}
