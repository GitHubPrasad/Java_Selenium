package OverRiding2;

public class Cal2 extends Cal1
{
	float c = 34.74f, b= 70.22f, z;
	
	public void test() 
	{
		z = b - c;
		System.out.println("Subtraction is: "+z);
	}
}
