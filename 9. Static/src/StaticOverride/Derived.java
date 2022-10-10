package StaticOverride;

public class Derived extends Base 
{
		// This method is hidden by display() in Base
		public static void display() 
		{
			System.out.println("Static method from Derived.");
		}
		
		// This method overrides print() in Base
		public void print() 
		{
			System.out.println("Non-static method from Derived.");
		}
		
		public void Bal()
		{
			System.out.println("Non ststic in child");
		}
}
