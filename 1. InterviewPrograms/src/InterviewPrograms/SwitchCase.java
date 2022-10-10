package InterviewPrograms;

import java.util.Scanner;

public class SwitchCase 
{

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Character :");
		char character = obj.next().charAt(0);
		
		switch(character)
		{
		case 'A':
			System.out.println("You have typed letter 'A'");
			break;
		case 'B':
			System.out.println("You have typed letter 'B'");
			break;
		case 'C':
			System.out.println("You have typed letter 'C'");
			break;
		default:
			System.out.println("You have typed letter other than (A, B, C)");
			
		
		
		}
	
		obj.close();
		System.out.println("End of the Program.........");
	

	}

}
