package week1.assignment;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) 
	{
		String test="I am a software tester";
		String[] t = test.split(" ");

		System.out.println("String Before Reverse is :: "+ test);
		String val = "";
		for (int i = 0; i < t.length; i++) {

		    if (i % 2 == 1)
		        val = val + new StringBuilder(t[i]).reverse().toString() + " ";
		    else
		        val = val + t[i] + " ";
		}
		val = val.trim();
		System.out.println("String After Reverse is  :: " + val);

	}

}
