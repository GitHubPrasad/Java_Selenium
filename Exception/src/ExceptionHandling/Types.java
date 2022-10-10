package ExceptionHandling;

public class Types 
{

	public static void main(String[] args) 
	{
		
		int a = 30, b = 0;
		int c;
		
		try
		{
			c = a/b;
			System.out.println("Result: " + c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number can't be divided by zero.");
		}
	
		 try 
		 {
	            String d = null; //null value
	            System.out.println(d.charAt(0));
	     } 
		 catch(NullPointerException e) 
		 {
	            System.out.println("NullPointerException..");
	     }
	
	     try 
	     {
	            String p = "This is like chipping "; // length is 22
	            char q = p.charAt(24); // accessing 25th element
	            System.out.println(q);
	     }
	     catch(StringIndexOutOfBoundsException e) 
	     {
	            System.out.println("StringIndexOutOfBoundsException");
	     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
