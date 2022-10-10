package AbstractClass;

public  class ExtendAbstract extends AbstractClass
{
	ExtendAbstract(String eName, String eAddress, int eID) 
	{
		//Called Parent class Parameterized Constructor
		super(eName, eAddress, eID);  
	}

	public void jobRole() 
	{
		System.out.println("This is an abstract method");
	}

	public static void main(String[] args) 
	{
		ExtendAbstract z = new ExtendAbstract("Prasad", "Vadgaon", 7020);
		z.department();
		z.jobRole();
	}











}
