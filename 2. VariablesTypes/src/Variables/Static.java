package Variables;

public class Static 
{
	static String sum = "The sum of numbers is: ";
	static String mult = "The multiplication is: ";
	
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 5;
		int d = 5;
		int x = a + b + c + d;
		int y = a * b * c * d;
		
		System.out.println(sum+x);
		System.out.println(mult+y);
	}
}
