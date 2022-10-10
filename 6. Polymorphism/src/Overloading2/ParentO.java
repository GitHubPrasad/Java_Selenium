package Overloading2;

public class ParentO 
{
	public void check(String str, int num)
	{
		if(num % 2 == 0)
		{
			System.out.println(str);
			System.out.println(num+" is Even.");
		}
		else
		{
			System.out.println(str);
			System.out.println(num+" is Odd.");
		}
	}

	public void check(float number)
	{
		if(number >= 0)
		{
			System.out.println(number+" is Positive. ");
		}
		else
		{
			System.out.println(number+" is Negative.");
		}
	
	
	}






}
