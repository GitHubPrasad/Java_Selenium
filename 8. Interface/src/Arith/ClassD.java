package Arith;

import java.util.*;

public class ClassD 
{

	public static void main(String[] args) 
	{
		int a;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a = sc1.nextInt();
		
		float b;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Second Number: ");
		b = sc2.nextFloat();
		
		double c;
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter Third Number: ");
		c = sc3.nextDouble();
		
		String st;
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter Statement: ");
		st = sc4.nextLine();
		
				
		ClassC obj1 = new ClassC();
		System.out.print("In This Program we are ");
		obj1.type();    //Print Statement
		obj1.add(a, b);
		System.out.println("Addition is: "+obj1.add(a, b));
		obj1.sub(c, b);
		obj1.multi(a, c);
		obj1.div(b, a);

	
	
	
	
	
	
	
	}

}
