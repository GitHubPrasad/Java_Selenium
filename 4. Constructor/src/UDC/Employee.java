package UDC;

public class Employee 
{
	int iD;
	String name;
	int salary;
	String department;
	
	
	// access_modifier class_name(){}
	//Constructors have the same name as the class itself.
	
	public Employee()
	{
		//this.engine = "porsche";
		//System.out.println("In a constructor.....");
	
		iD = 127;
		name = "Prasad Patil";
		salary = 70000;
		department = "testing";
	}
	
	public void display()
	{
		System.out.println("Employee ID: "+iD+"\n"+"Employee Name: "+name+"\n"+"Salary: "+salary+"\n"+"Department: "+department+"\n");
	}
	
}
