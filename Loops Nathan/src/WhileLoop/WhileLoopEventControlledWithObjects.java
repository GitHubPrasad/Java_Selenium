package WhileLoop;

import java.util.*;

public class WhileLoopEventControlledWithObjects 
{
	// Event controlled is also called Sentinel Controlled.
	// Write a program that simulates entering a pin at an ATM.
	// Use a while loop in the implementation.

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String password = " ";
		
		/*while(password != "openNow")
		{
			System.out.println("Enter your Password--> ");
			password = scan.nextLine();
			if(password == "openNow")
				System.out.println("Correct Password! You may proceed.\n");
			else
				System.out.println("Wrong Password! Please try again.\n");
		}*/
		
		while(!password.equals("openNow"))
		{
			System.out.println("Enter your Password--> ");
			password = scan.nextLine();
			if(password.equals("openNow"))
				System.out.println("Correct Password! You may proceed.\n");
			else
				System.out.println("Wrong Password! Please try again.\n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}















}
