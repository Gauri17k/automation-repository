package functions;

public class StaticAndNonStatic2 {
	
	public static String name="gauri";
	
	public  String surname="kulkarni";
	
	
	public static void fun1()
	{
		
	}
	
	public void fun2()
	{
		
	}
	

	public static void main(String[] args) {
		
	System.out.println(name);
	fun1();
	
                    //reference    // class 
 StaticAndNonStatic2  obj=           new  StaticAndNonStatic2(); 
		 
		 
	System.out.println(obj.surname);
	
	obj.fun2();

	}

}
