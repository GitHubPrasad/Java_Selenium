package MyInterface;

public class MyClass3 implements MyInterface2
{

	@Override
	public void myFunction11() 
	{
		System.out.println("myFunction11() is executing with data = "+data11+"...");
		
	}

	@Override
	public void myFunction12() 
	{
		System.out.println("myFunction12() is executing with data = "+data12+"...");
		
	}

	@Override
	public void myFunction21() 
	{
		System.out.println("myFunction21() is executing with data = "+data21+"...");
		
	}

	@Override
	public void myFunction22() 
	{
		System.out.println("myFunction22() is executing with data = "+data22+"...");
		
	}
	
	public static void main(String[] args) 
	{
		MyClass3 obj1 = new MyClass3();
		obj1.myFunction11();
		obj1.myFunction12();
		System.out.println(obj1.myFunction13());  //String is called
		System.out.println(MyInterface1.myFunction14());
		obj1.myFunction21();
		obj1.myFunction22();
	
	
	
	
	
	}
	
}
