package loops;

public class Forloop2 {
	
	public static void main(String[] args) {
		
		boolean login=false;
		
		for(int i=1;i<=5;i++)
		{
			if(login)
			{
				break;
			}
			
			if(i==4)
				login=true;
			}
		
		System.out.println("testing");
		}
	}


