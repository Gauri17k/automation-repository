package functions;

public class StaticAndNonStatic {
	
	
	

	public static void main(String[] args) {
		
		//static varible and fun calling from second class
		
		System.out.println( StaticAndNonStatic2.name);
		 StaticAndNonStatic2.fun1();
		 
		 //non static variables and fun calling from second class
		 
		 StaticAndNonStatic2 obj= new StaticAndNonStatic2();
		 System.out.println(obj.surname);
		 obj.fun2();
		
		


	}

}
