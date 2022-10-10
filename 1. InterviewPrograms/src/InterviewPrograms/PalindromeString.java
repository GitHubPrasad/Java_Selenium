package InterviewPrograms;

import java.util.Scanner;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
		
		/* The Palindrome String is a string that remains the same when 
		   its characters are reversed. Like MADAM	*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		
		String oristring = str;
		
		String rev = "";
		
		int len = str.length();
		
		for(int i = len - 1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
			System.out.println(rev);
		
		if(oristring.equals(rev))
		{
			System.out.println(oristring+ " is a Palindrome String");
		}
		else
		{
			System.out.println(oristring+ " is a Not Palindrome String");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
