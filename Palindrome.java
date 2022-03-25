package week1.assignment;

public class Palindrome {

	public static void main(String[] args) 
	{
		String str = "madam";
		String rev ="";
		
		
         int leng = str.length();
         
         for(int i=(leng-1);i>=0; i--)
           
         {
        	 rev = rev + str.charAt(i);
         }
         if(str.toLowerCase().equals(rev.toLowerCase()))
        		 {
        	 System.out.println(str + " is a Palindrome String");
        		 }
         else
         {
        	 System.out.println(str + " is a Not Palindrome String");
         }
        		 
	}

}
