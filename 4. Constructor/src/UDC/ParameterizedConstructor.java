package UDC;

public class ParameterizedConstructor 
{
	int x;
	
	public ParameterizedConstructor(int i)
	{
		x = i;
	}
	
	public static void main(String[] args) 
	{
		//Constructor is invoked when you initialize an object.
		ParameterizedConstructor demo1 = new ParameterizedConstructor(10);//passing the value 10
		ParameterizedConstructor demo2 = new ParameterizedConstructor(20);
		//You do not have to explicitly call constructors unlike methods.
		
		System.out.println("Number is: "+demo1.x);
		System.out.println("Multiplication is: "+demo1.x * demo2.x);
		
		
	}
}
