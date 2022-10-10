package calcuherit;

import java.util.*;

public class Calcu7 
{
	public Calcu7() 
	{
		System.out.println("In Parent Class Constructor...");
	}
	
	int num1,num2,num3;
	
	public void add()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		num1 = s.nextInt();
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter The Second Number: ");
		num2=s1.nextInt();
		
		num3=num1+num2;
		System.out.println("Addition Is: "+num3);
	}
	
	public void sub()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		num1=s.nextInt();
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter The Second Number: ");
		num2=s1.nextInt();
		
		num3 = num1 - num2;
		System.out.println("Substraction Is: "+num3);
	}
}
