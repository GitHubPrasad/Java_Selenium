package InheritanceLoop;

import java.util.*;

public class LoopA 
{
	public void factorial()
	{
		int num,product;
		
		System.out.println("Enter A Number: ");
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();
		
		for(product=1; num>=1; num--)
		{
			product = product*num;
		}
		System.out.println("Factorial= "+product);
	}
	
	public void reverse()
	{
		int num,rev=0,dig;
		
		System.out.println("Enter A Number..");
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();
	
		while(num>0)
		{
			dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}
		System.out.println("Reverse No="+rev);
	}
}
