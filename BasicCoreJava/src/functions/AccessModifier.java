package functions;

public class AccessModifier {
	
	
	public static void main(String[] args) {
		
		AccessModifier obj =new AccessModifier();
		obj.publicfunction();
		
		obj.privatefunction();
		
		obj.defaultfunction();
		
		obj.protectedfunction();
		
	}
	
	public void publicfunction()
	{
	
		System.out.println("public function");
	}

	private void privatefunction()
	{
	
		System.out.println("private function");
	}
	
	
	protected void protectedfunction()
	{
	
		System.out.println("protected function");
	}
	
	
	 void defaultfunction()
	{
	
		System.out.println("default function");
	}



}
