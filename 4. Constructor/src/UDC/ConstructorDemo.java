package UDC;

public class ConstructorDemo 
{
	int x;
	
	public ConstructorDemo()
	{
		x = 10;
	}
	
	public static void main(String[] args) 
	{
		ConstructorDemo demo1 = new ConstructorDemo();
		ConstructorDemo demo2 = new ConstructorDemo();
		
		
		System.out.println("Number is: "+demo1.x);
		System.out.println("Multiplication is: "+demo1.x * demo2.x);
		
		
	}
	
	
}
