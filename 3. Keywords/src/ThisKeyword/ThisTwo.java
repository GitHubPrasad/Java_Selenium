package ThisKeyword;

public class ThisTwo 
{

	public static void main(String[] args) 
	{
		//Instantiating the class
		ThisOne obj = new ThisOne();
		
		//Invoking(calling) the print method
		obj.print();
		
		//Passing a new value to the num variable through parameterized constructor
		ThisOne objnew = new ThisOne(30);
		objnew.print();
	}

}
