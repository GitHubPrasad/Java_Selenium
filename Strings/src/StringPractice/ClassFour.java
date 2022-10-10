package StringPractice;

import java.util.*;

public class ClassFour 
{
	static String ntr1, ntr2, ntr3, ntr4;
	
	public String input(String ntr1, String ntr2, String ntr3, String ntr4) 
	{
		//this.ntr1 = ntr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word");
		ntr1 = sc.nextLine();
				
		System.out.println("Enter second word");
		ntr2 = sc.nextLine();
				
		System.out.println("Enter third word");
		ntr3 = sc.nextLine();
				
		System.out.println("Enter fourth word");
		ntr4 = sc.nextLine();
		
		return("");
	}
		
	public static void main(String[] args) 
	{
		ClassFour obj1 = new ClassFour();
		
		String str1 = obj1.input("ntr1", "ntr2", "ntr3", "ntr4");
		
		if(ntr1 == ntr2)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		//True
		
		if(ntr1 != ntr2)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		//False
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
