package Super;

public class Lower extends Middle
{

	public static void main(String[] args) 
	{
		/*Middle obj1 = new Middle();
		obj1.addition();
		obj1.sub();

		System.out.println("---------------");
		
		Upper obj2 = new Upper();
		obj2.addition();
		
		System.out.println("---------------");
		
		Upper obj3 = new Middle();
		obj3.addition();
	
		System.out.println("---------------");*/
		
		Upper z1 = new UMP();
		
		z1.addition();
		z1.sub();
		z1.Vivek();
		z1.Prasad();
		
		//With Super parent class we can use constructors ranges from super parent, parent,....., child
		//But with child class we cannot access constructors of parent and super parent classes.
		
		
	}

}
