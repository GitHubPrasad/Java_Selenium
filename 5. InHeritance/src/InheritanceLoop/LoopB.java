package InheritanceLoop;

import java.util.*;

public class LoopB extends LoopA
{
	public void palindrome()
	{
		int num;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter The Number");
		num = obj.nextInt();
		
		int n = num, reverse = 0, remainder;
		
		while(num>0)
		{
			remainder = num%10;
			reverse = reverse*10 + remainder;
			num = num / 10;
		}
		if(reverse == n)
		{
			System.out.println(n+"Is Palindrome");
		}
		else
		{
			System.out.println(n+"Is Not Palindrome");
		}
	}
}
