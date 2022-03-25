package week1.assignment;

public class NumberConvertion 
{
public static void main(String[] args) 

 {
int posno, negno;

negno = -50;
	posno = ~(negno-1);
	
	System.out.println("Negative Number = " + negno + " is converted to Positive number as = " + posno);
	
posno = 25;

negno = (~(posno-1));

System.out.println("Positive Number = " + posno + " is converted to Negative number as = " + negno);
  }
}
