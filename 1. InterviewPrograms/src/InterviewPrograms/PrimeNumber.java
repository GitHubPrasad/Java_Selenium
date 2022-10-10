package InterviewPrograms;

import java.util.Scanner;

public class PrimeNumber 
{
	
	public static void main(String[] args) 
	{
		int num, i, count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Number");
		
		num = sc.nextInt();
		
		for(i=2; i < num/2; i++)
		{
			if(num % i == 0)
			{
				count++;
				break;
			}
		}
		if(count == 0 && num != 1)
		{
			System.out.println(num+" is a Prime Number");
		}
		else
		{
			System.out.println(num+" is a Not Prime");
		}
				
	}

}
