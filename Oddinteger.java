package week1.assignment;

public class Oddinteger 

{

	public static void main(String[] args) 
	
	{
		int i,j, num=10;
		
		System.out.println("The Odd Numbers from 1 to " + num );
		
		for (i=1; i<=10;i++)
			
			
		{
			if(i%2!=0)
			{
				System.out.println( + i);
			}
		}
		
		
		System.out.println("The Even Number from 1 to " + num);
		
		for( j=1; j<=10; j++)
		{
			if(j%2==0)
			{
				System.out.println( j +"");
			}
		}
	}
}
