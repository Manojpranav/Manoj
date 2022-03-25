package week1.assignment;

public class FindDupicateNumber {

	public static void main(String[] args)
	{
		int [] Arr = new int [] { 1, 2 ,5, 7, 11, 24, 5,1 };
		 System.out.println("Dupicate Number is ");
		 for ( int i=0;i<Arr.length; i++) 
		 {
			 for( int j=i+1;j<Arr.length; j++)
			 {
				 if(Arr[i]==Arr[j])
					 System.out.println(Arr[i]);
			 }
		 }

	}

}
