package oops.polymorphism;

public class MethodeOverloading {

	public static void main(String[] args) {
		
		
		MethodeOverloading m= new MethodeOverloading();
		m.sum(10, 20);
		m.sum(10, 20, 30);
	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int sum(int a, int b,int c)
	{
		return a+b+c;
	}
	

}
