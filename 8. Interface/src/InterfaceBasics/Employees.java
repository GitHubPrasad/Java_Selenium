package InterfaceBasics;

interface Persons
{
	public void department();  //Abstract method
	void jobRole();            //Abstract method
}

	public class Employees implements Persons 
{

		@Override
		public void department() 
		{
			System.out.println("Department: Civil");
			
		}

		@Override
		public void jobRole() 
		{
			System.out.println("Job Role: Project Manager");
			
		}
		
		public static void main(String[] args) 
		{
			Employees e = new Employees();
			e.department();
			e.jobRole();
		}
		
		
		
		
		
		
		
		
		
		
}
