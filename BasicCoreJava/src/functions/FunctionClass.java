package functions;

public class FunctionClass {

	public static void main(String[] args) {
   
	/*	myfirstFun();
		sum();
		sum1(2,4);*/
		//sum2(10,4);
		
		int i =sum2(10,4);
		System.out.println(i);
	}
	//func with no return type and no arguments
	public static void myfirstFun()
	
	{
		System.out.println("test");
	}
	
	//without parameter
	public static void sum()
	{
		int a=10,b=20;
		
		System.out.println(a+b);
	}
	//with parameter
	public static void sum1(int a, int b)
	{
	
		
		System.out.println(a+b);
	}
	// function  with return type and two arguments
	
	public static int sum2(int a, int b)
	{
	
		return(a+b);
   /*
		System.out.println(a+b);
		 return(1);*/
	}
	
}
