package Super;

public class Middle extends Upper
{
	public Middle()	//constructor
	{
		super();
		super.addition();
		System.out.println("middle class constructor");
	}
	
	public void sub()	//Method
	{
		super.addition();
		//super();
		System.out.println("middle class method");
	}
	
	/* By using super keyword we can call: 
	 * parent class constructor into child class constructor.
	 * parent class method into child class constructor.
	 * parent class method into child class method.
	 * 
	 * BUT we cannot call parent class constructor into child class method. 
	 */
	
	
	
	
	
	
	
	
}
