package ThisKeyword;

public class MyClass 
{
	private int a,b;    //instance variables. 
	
	public MyClass(int a, int b)  //constructor parameter name same as member variable
	{
		this.a = a;
		this.b = b; 
	/* "this.a" points the member variable. 
	 * (a = a) is ambiguous, so this keyword is used.*/
	}

	public MyClass()
	{
		this(0,0);
		//it will call parameterized constructor with value 0 and 0
	}

	public void setData(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public void display()
	{
		System.out.println("The values of a and b are: "+a+" and "+b);
	}
}
