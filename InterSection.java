package week1.assignment;

public class InterSection 
{

	public static void main(String[] args) 
	{
		int a1[] = {1,2,4,6,7,9,10,12};
		int a2[]= {1,3,4,5,6,7,8,9};
		System.out.println("InterSection of two array list is"); 
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
					{
					System.out.println( a1[i]);
					}
			}
		}
	}
}
