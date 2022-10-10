package ForLoop;

import java.util.*;

public class ForLoopSum 
 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many grades you would like to enter..");
		int times = scan.nextInt();
		int sumOfGrades = 0;
		
		for(int i = 1; i <= times; i++)
		{
			System.out.println("Enter Grade "+ i + "...");
			
			int grade = scan.nextInt();
			
			// sumOfGrades = sumOfGrades + grade;
			sumOfGrades += grade;
			
		}
				System.out.println("The sum of the grades is: "+ sumOfGrades);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
