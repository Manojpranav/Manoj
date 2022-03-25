package week1.assignment;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		
int num, i;
num = 29;
boolean flag = false;

for(i=2; i<=num/2; i++)
{
	if(num %i ==0)
	{
		flag = true;
		break;
	}
}
if(!flag)
{
	System.out.println(num + " is a Prime Number.");
}
else
{
	System.out.println(num + " is a Non Prime Number.");
}
	}

}
