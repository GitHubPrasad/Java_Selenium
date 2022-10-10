package ThisKeyword;

public class ThisOne 
{
	int num = 10;   //instance variable num.
	
	ThisOne()  //default constructor
	{
		System.out.println("Example on 'This' keyword.");
	}

	ThisOne(int num) //parameterized constructor
	{
		//invoking the default constructor
		this(); //Constructor calling
		//Assigning the local variable num to the instance variable num.
		this.num = num;
	}

	public void greet()
	{
		System.out.println("Welcome !...");
	}

	public void print()
	{
		//Local variable num
		int num = 20;
		//Printing the local variable
		System.out.println("Local variable num is: "+num);
		//Printing the instance variable
		System.out.println("Instance variable num is: "+this.num);
		//Invoking the greet method of a class.
		this.greet(); //method calling
	
	}










}
