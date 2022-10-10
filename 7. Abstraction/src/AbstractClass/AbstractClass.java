package AbstractClass;

public abstract class AbstractClass 
{
	String eName;
	String eAddress;
	int eID;
	
	public AbstractClass(String eName, String eAddress, int eID) 
	{
		this.eName = eName;
		this.eAddress = eAddress;
		this.eID = eID;
	}
	
	public void department() 
	{
	System.out.println("This employee works for this department");	
	}
	
	// Abstract method ends with semicolon
	public abstract void jobRole();
	//Cannot instantiate an abstract class.
	
	
	
	
	
	
	
	
	
}
