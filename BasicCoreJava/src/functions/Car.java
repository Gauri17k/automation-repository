package functions;

public class Car {
	
	//int wheels=4; 
	 static int wheels=4;  //class varible
	 
	String colour="White"; // instance varible
	String model="VDI";
	
	public void breaking()
	{
		//System.out.println("White VDI car is having four wheeler");
		
		System.out.println( colour +" "+ model + "car is having " +  wheels + " wheels ");
	}
	
	// default constructor
	public Car()
	{
		
	}
	//parameterize constructor
	
	public Car(String colour1,String model1)
	{
		colour=colour1;
		model=model1;
	}
	
	

}
