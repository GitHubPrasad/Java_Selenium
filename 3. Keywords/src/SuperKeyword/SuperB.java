package SuperKeyword;

public class SuperB extends SuperA 
{
	String name = "Priyanka";

	public SuperB()
	{
		//super();
	}
	
	
	
	public void display() 
	{
	System.out.println("Super class name: "+super.name);	
	System.out.println("Sub class name: "+name);
	}

	public void finaldisplay() 
	{
		//Syntax to call method in child Class
		//super.methodName();
		super.display();
		
	}










}
