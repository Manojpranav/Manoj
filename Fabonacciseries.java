package week1.assignment;

public class Fabonacciseries 
{

	public static void main(String[] args) 
	
	{
		int i, sum, firstno=0, secondno=1, range =5;
		
		for (i=0; i<=range; i++)
		{
			sum = firstno + secondno;
			
			firstno = secondno;
			secondno = sum;
			System.out.println("Result = "+sum);
		}

	}

}
