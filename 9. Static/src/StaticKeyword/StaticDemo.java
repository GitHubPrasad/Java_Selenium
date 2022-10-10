package StaticKeyword;

public class StaticDemo 
{
	static int staticVar;   //Static or class variable
	int var;   //Instance variable

	public StaticDemo()
	{
		var = 0;   //In constructor initialized non-static variable to 0
	}

	public static void setStaticVar(int x) 
	{
		staticVar = x;  //Static method can ONLY access static variables.
		//var = 100;      //Static method cannot access non-static variables.
	}

	public void increase() 
	{
		staticVar++; //Increase the value of static variable
		var++;       //Increase non-static variable.
	}

	public void display() 
	{
	System.out.println("The value of static variable: "+ staticVar); //display the value of static variable.	
	System.out.println("The value of non-static variable: "+var);    //display the value of non-static variable.
	System.out.println();
	}









}
