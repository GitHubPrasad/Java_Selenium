package StaticKeyword;

public class StaticDemoMain 
{

	public static void main(String[] args) 
	{
		StaticDemo sd1 =  new StaticDemo();
		StaticDemo sd2 =  new StaticDemo();
		
		//increase the static variable two times using sd1 object
		sd1.increase();
		sd1.increase();
		sd1.display();
		//sd1.setStaticVar(30); static method cal also be called by creating objects.
		
		//increase the static variable three times using sd1 object
		sd2.increase();
		sd2.increase();
		sd2.increase();
		sd2.display();
		
		//static members can also be accessed without any object
	    StaticDemo.setStaticVar(50);
	    //called static method without using any object
	    System.out.println("Static variable without object: "+StaticDemo.staticVar);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
