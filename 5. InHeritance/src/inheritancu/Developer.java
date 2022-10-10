package inheritancu;

public class Developer extends Employee // it is a child class of Employee
{
	double bonus = 10000;
	// This constructor will execute after executing Employee constructor
	
	public Developer()
	{
		System.out.println("This is constructor of Developer class.");
	}
	
	public void displaySalary()
	{
		//Variable "salary" is in the base class
		
		System.out.println("The salary is : "+ (salary + bonus)+"\n");
		// Salary value is inherited from Employee class.
	}

}

