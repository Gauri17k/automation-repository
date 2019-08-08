package functions;

public class EligibilityFun {

	public static void main(String[] args) {
	
    boolean  a= eligible(28);
    if(a)
    {
        System.out.println("you are eligible");
    }
    
    else 
    	 System.out.println("you are not eligible");
}
	
	public static boolean eligible(int age)
	{
		
		if (age>=18  && age<=30)
		
		{
			return true;
		
		}
	
	else 
		return false;
	
		
	}

}
