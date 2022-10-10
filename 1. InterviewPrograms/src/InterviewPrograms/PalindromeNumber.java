package InterviewPrograms;

import java.util.Scanner;

public class PalindromeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		
		int num =  sc.nextInt();
		
		int orinum = num;  //
		
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if(orinum == rev)  //
		{
			System.out.println(orinum+" is a Palindrome Number.");
		}
		else
		{
			System.out.println(orinum+" is not a Palindrome Number.");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
