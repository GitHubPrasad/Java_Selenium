package calculator;

import java.util.Scanner;

public class Grandfather 
{
	int num1;
	int num2;
	int num3;
	int result;
	
	
	public Grandfather()
	{
				
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		num1 = sc1.nextInt();
		num2 = sc2.nextInt();
		num3 = sc3.nextInt();

		System.out.println("Enter First Number: ");
		System.out.println("Enter Second Number: ");
		System.out.println("Enter Third Number: ");
	}

	public  void addition()
	{
		result = num1 + num2;
		System.out.println("Addition is = "+result);
	}

	public  void subtraction()
	{
		result = num3 - num2;
		System.out.println("Subtraction is = "+result);
	}
	



}



