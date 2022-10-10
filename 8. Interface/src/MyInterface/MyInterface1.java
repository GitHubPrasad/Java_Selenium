package MyInterface;

public interface MyInterface1 
{
	int data11 = 101;
	int data12 = 102;
	
	void myFunction11();
	void myFunction12();
	
	default String myFunction13()
	{
		return "Default myFunction13() is executing...";
	}

	static String myFunction14()
	{
		return "Default myFunction14() is executing...";
	}





}
