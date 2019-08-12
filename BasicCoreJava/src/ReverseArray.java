import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		
		System.out.println(Arrays.toString(a));
		
		
		for(int i=0;i<=4;i++)
		{
			System.out.print(a[i]);
		}
		
			System.out.println();
	
		
		for(int i=4;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		
System.out.println();
	
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		
		
		

	}



}
