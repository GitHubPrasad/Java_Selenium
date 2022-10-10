package AbstractClass;

public class MyClass2 extends MyClass1 
{

	@Override
	void myFunction12() 
	{
		
		System.out.println("myFunction12 is executing...");
	}

	public static void main(String[] args) 
	{
		MyClass2 obj = new MyClass2();
		obj.myFunction11();
		obj.myFunction12();
	
		MyClass1 s = new MyClass1() 
		{

			@Override
			void myFunction12() 
			{
				// TODO Auto-generated method stub
				System.out.println("myFunction12 is executing here...");
			}
		};
	
			s.myFunction11();
			s.myFunction12();
	
	
	
	
	
	
	}
	















}
