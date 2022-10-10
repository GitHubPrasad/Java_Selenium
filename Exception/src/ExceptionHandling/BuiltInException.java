package ExceptionHandling;

public class BuiltInException 
{

	public static void main(String[] args) 
	{
		int[] myArray = {10, 20, 30, 40, 50};
		String myString = "abcd";
		
		try
		{
			System.out.println("The value of myArray[10]: " + myArray[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index of the array.");
		}
	
		try
		{
			System.out.println("Character at 5 th of the string: " + myString.charAt(5));
		}
		catch(NullPointerException e)
		{
			System.out.println("The string is pointing a null value.");
		}
	
		try
		{
			int number = Integer.parseInt("ABC");
			System.out.println("The number is: " + number);
		}
		catch(NumberFormatException e)
		{
			System.out.println("It is not a valid number.");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
