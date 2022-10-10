package AbstractClass;

public class Programmer extends Emp 
{
	@Override
	public void description() //Override description method
	{
		System.out.println("It is a Programmer");
	}
	@Override
	void salary() //salary method must be implemented i.e. defined
	{
		System.out.println("Salary of Programmer is 25000");
	}






}
