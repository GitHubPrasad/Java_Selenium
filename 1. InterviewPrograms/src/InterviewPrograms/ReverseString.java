package InterviewPrograms;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		// Using + (String Conctanation Opertion)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");  
		String str = sc.nextLine();
		
		String stri = "java";
		String rev = "";
		
		int len = str.length(); //4
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i); 	//DCBA
		}
		
		System.out.println("Reversed String is 1: "+ rev);
		
		
//		//Using Character Array
//		
//		char a[] = str.toCharArray();
//		
//		int leng = a.length;
//		
//		for(int i=leng-1; i>=0; i--)
//		{
//			rev = rev + a[i];
//		}
//		
//		System.out.println("Reversed String is: "+ rev);
//		
//		
//		//Using String Buffer Class
//		
//		StringBuffer sb = new StringBuffer(str);
//		System.out.println(sb.reverse());
//		

	}

}
