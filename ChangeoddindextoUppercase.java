package week1.assignment;

import java.util.Locale;

public class ChangeoddindextoUppercase {

	public static void main(String[] args) 
	{
		String word  = "selenium assignment";
		
		StringBuffer upp = new StringBuffer();
		
        char[] ch = word.toCharArray();
        
        for(int i=0;i<ch.length; i++)
        {
        	char c = ch[i];
        	
        	if(i%2!=0)
        	{
        		
        c = Character.toUpperCase(c);
        	
        	}
        	upp.append(c);
        	
        }
        System.out.println("Modified String is " + upp.toString() );
	}

}
