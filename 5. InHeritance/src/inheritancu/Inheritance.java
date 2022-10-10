package inheritancu;

public class Inheritance 
{

	public static void main(String[] args) 
	{
		// The constructors of base and derived class will be called respectively.
		
		Developer dev = new Developer();
		dev.displaySalary();
		
		Tester tester = new Tester();
		tester.displaySalary();
		
	}

}
