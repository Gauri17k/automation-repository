package exceptionHandling;

public class Finally {

	public static void main(String[] args) {
	
		
		try
		{
			String str="gauri";
			
			System.out.println(str.charAt(3));
			
			System.out.println(str.charAt(7));
			
			
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace(); 
		}
		finally {
			System.out.println("finally block excuted"); // will alwys excuete with either try or with catch
		}

	}

}
