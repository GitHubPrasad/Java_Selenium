package WhileLoop;

import java.util.*;

public class WhileLoopEventControlled 
{
	// Event controlled is also called Sentinel Controlled.
	// Write a program that simulates entering a pin at an ATM.
	// Use a while loop in the implementation.

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int pin = 0;
		
		while(pin != 1234)
		{
			System.out.println("Enter your pin--> ");
			pin = scan.nextInt();
			if(pin == 1234)
				System.out.println("Correct pin ! You may proceed.\n");
			else
				System.out.println("Wrong pin! Please try again.\n");
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}















}
