package Overloading1;

public class Parent 
{
	public static void math(double number)
	{
		System.out.println("The number is: "+number);
	}
	
	public static void math(int length, int breadth) 
	{
		System.out.println("The area of Rectangle is: "+(length*breadth));
	}
	
	public static void math(float num1, float num2, float num3, float num4)
	{
		System.out.println("The addition of four numbers is: "+(num1 + num2 + num3 + num4));
	}








}
