package StaticOverride;

public class Test {

	public static void main(String[] args) 
	{
		Base o1 = new Derived();
		
		/* As per overriding rules this should call to class Derive's static
		   overridden method. Since static method can not be overridden, it
		   calls Base's display()*/
		
		o1.display();
					
		// Here overriding works and Derive's print() is called
		o1.print();
		
		//Derived.display(); 
		
		System.out.println("...................");
		
		Base o2 = new Base();
		o2.display();
		o2.print();
		
		System.out.println("...................");
	
		Derived o3 = new Derived();
		o3.display();
		o3.print();
		
	
	
	
	
	
	}

}
