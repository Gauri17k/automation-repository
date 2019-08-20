package exceptionHandling;

public class Exception2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("gauri");
		
		Thread.sleep(5000); //nature is -checked exception
		System.out.println("k");
		
		Exeception1.sleep(5000);
	}

}
