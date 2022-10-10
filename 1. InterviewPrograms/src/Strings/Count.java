package Strings;
import java.util.*;

public class Count 
{
	public static void main(String[] args) 
	{
		
		int count[] = new int[256];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
	
		
		for(int i = 0; i < str.length(); i++)
		{
			count[(int)str.charAt(i)]++;
		}
		
		for(int i = 0; i < 256; i++)
		{
			if(count[i]!= 0)
			{
				System.out.println("No of occurence of "+(char)i+" is: "+count[i]);
			}
		}	

	}
}
