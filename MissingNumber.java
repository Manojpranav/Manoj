package week1.assignment;

import java.util.Arrays;

public class MissingNumber 
{

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,6,7,8,10,11};
		Arrays.sort(arr);
		System.out.println("Missing Number in Given Array List is" );
		for(int i=0;i<arr.length-1;i++)
			{
			if(arr[i+1]-arr[i]>1)
				{
				int temp =arr[i+1]-arr[i];
				
				for(int j=1;j<temp;j++)
				{
					
					System.out.println(arr[i]+j);
				}
				temp=0;
				}
			}
	}
	
}
