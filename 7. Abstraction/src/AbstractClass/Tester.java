package AbstractClass;

public class Tester extends Emp 
{
	@Override
	public void description()  //override description method
	{
		super.description();  //call description of parent class
		System.out.println("works as a tester.");
	}
 
	@Override
	void salary()    //The salary must be defined in the child class 
	{
		System.out.println("Salary of Tester is 45000");
	}


}
