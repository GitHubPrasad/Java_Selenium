package FunctionOverloading;

public class FunctionOverload 
{
	public static void area(float side)
	{
		System.out.println("Area of a square: "+ (side*side));
	}

	public static void area(double radius)
	{
		System.out.println("Area of a circle: "+ (3.1415*radius*radius));
	}

	public static void area(float l, float b)
	{
		System.out.println("Area of a rectangle: "+ (l * b));
	}
}
