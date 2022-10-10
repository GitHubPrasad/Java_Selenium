package InheritanceLoop;

import java.util.*;

public class LoopC extends LoopB
{
		public void table()
		{
			int num;
			
			System.out.println("Enter A Number");
			Scanner obj = new Scanner(System.in);
			num = obj.nextInt();
			
			for(int i=1; i<=num; i++)
			{
				for(int j=1; j<=num; j++)
				{
					System.out.print(""+i*j+"\t");
				}
				System.out.print("\n");
			}
		}
		public static void main(String[]args)
		{
			int a,b,c;
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter The First Number: ");
			a = s.nextInt();
			
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter The Second Number: ");
			b = s1.nextInt();
			
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter The Third Number: ");
			c = s2.nextInt();
			
			LoopC obj = new LoopC();
			
			if(a>b && a>c)
			{
				obj.factorial();
			}
			else if(b>c)
			{
				obj.reverse();
			}
			else 
			{
				obj.palindrome();
			}
			obj.table();
		}
			
}		
