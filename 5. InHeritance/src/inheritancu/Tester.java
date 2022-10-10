package inheritancu;

public class Tester extends Employee //Tester is another child class of Employee.
{
	double bonus = 20000;
	// This constructor will execute after executing Employee constructor.
	
	public Tester()
	{
		System.out.println("This is constructor of Tester class.");
	}

	public void displaySalary()
	{
		//Variable "salary" is in the base class
		
		System.out.println("The salary is : "+ (salary + bonus)+"\n");
		// Salary value is inherited from Employee class.
	}





}
