package loops;

public class Array2 {

	public static void main(String[] args) {
		
		String [][] str=new String[3][2];
		
		//row1
		
		str[0][0]="u1";
		str[0][1]="p1";
		
		//row2
		
		str[1][0]="u2";
		str[1][1]="p2";
		
		//row3
	
		str[2][0]="u3";
		str[2][1]="p3";
		
		for(int i=0;i<3;i++)
			
		{
			for(int j=0;j<2;j++)
			{
			//System.out.println(str[i][j]);
				
				System.out.print(str[i][j]+" ");
		}
			System.out.println(" " );
		}
	}
}
		
		

	


