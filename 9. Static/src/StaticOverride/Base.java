package StaticOverride;

public class Base 
{

	// Static method in base class which will be hidden in subclass
	public static void display() 
	{
		System.out.println("Static method from Base.");
	}
	
	// Non-static method which will be overridden in derived class
	public void print() 
	{
		System.out.println("Non-static method from Base.");
	}
	
	public void demo()
	{
		System.out.println("Non-static in base class.");
	}
	
}
