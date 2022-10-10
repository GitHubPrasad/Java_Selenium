package InterviewPrograms;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		int num, product;
		
		System.out.println("Enter A Number");
		
		Scanner obj = new Scanner(System.in);
		
		num = obj.nextInt();
		
		for(product = 1; num >= 1; num--)
		{
			product = product * num;
		}
			System.out.println("Factorial = "+product);
	}

}
