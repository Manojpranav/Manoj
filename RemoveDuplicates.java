package week1.assignment;

public class RemoveDuplicates 
{

	
	public static void main(String[] args)

	{
		
		
	String input="We learn java basics as part of java sessions in java week1";  
	      String[] words=input.split(" ");  

	      for(int i=0;i<words.length;i++)  
       
	      {
	         if(words[i]!=null)
	         {
	         
	         for(int j=i+1;j<words.length;j++)  

	         {
	            
	         if(words[i].equals(words[j])) 

	            {
	               words[j]=null;  

	            }
	         }
	         }
	      }
	      for(int k=0;k<words.length; k++)  //Displaying the String without duplicate words    
	      {
	         if(words[k]!=null)
	         {
	            System.out.println(words[k]);
	         }
	         
	        }  
	}
}
