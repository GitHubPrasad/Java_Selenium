package Inheritance;

import java.util.Scanner;

public class Small extends Medium 
{

	public static void main(String[] args) 
	{
		int a;
		int b;
		int y;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		a = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter The Second Number: ");
		b = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter The Third Number: ");
		y = sc3.nextInt();
	
		Small p = new Small();
		
		p.add(a,b);
		System.out.println("Addition Is: "+p.add(a, b));
		 
		p.sub(b,a);
	    System.out.println("Substraction Is: "+p.sub(b, a));
		
	    p.mul(a,y);
		System.out.println("Multiplication Is: "+p.mul(a, y));
		
		p.div(b,a);
		System.out.println("Division Is: "+p.div(b, a));
	}

}
