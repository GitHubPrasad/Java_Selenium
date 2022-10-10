package InterviewPrograms;

import java.util.Scanner;

public class Prime1 
{

	public static void main(String[] args) 
	{
	      int num, i, count=0;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter a Number: ");
	      num = sc.nextInt();
	      
	      for(i=2; i<num; i++)
	      {
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count == 0)
	         System.out.println("It is a Prime Number.");
	      else
	         System.out.println("It is not a Prime Number.");

	}

}
