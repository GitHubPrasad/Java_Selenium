package Arith;

public class ClassC implements ClassB 
{
	int a;  //instance Variable
	
	public void type()
	{
		System.out.println("Performing Arithmetic operations...");
	}
	
	@Override
	public float add(int a, float b)  //Override methods must have same method name with signature
	{
		this.a = a;   //Local is assigned to Instance
		//System.out.println("Addition is: "+(this.a + b));
		return(this.a + b);
	}

	@Override
	public void sub(double c, float b) 
	{
		System.out.println("Subtraction is: "+(c-b));
		
	}

	@Override
	public void multi(int a, double c) 
	{
		System.out.println("Multiplication is: "+(a*c));
		
	}

	@Override
	public void div(float b, int a) 
	{
		//float num3 = 54.66f;
		System.out.println("Division is: "+(b/a));
		
	}

}
