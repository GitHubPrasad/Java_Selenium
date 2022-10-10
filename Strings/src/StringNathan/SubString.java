package StringNathan;

public class SubString 
{

	public static void main(String[] args) 
	{
		String word = "Automation";
		
		//string index start at 0 NOT at 1
		
		String sub1 = word.substring(0,3);
		System.out.println("The first four letters of word "+ word +" are: "+sub1);
		
		String sub2 = word.substring(0,4);  //ending index must always be one more than substring ending(exclusive)
		System.out.println("The first four letters of word "+ word +" are: "+sub2);
	
		String sub3 = word.substring(4,10); //if there is no second argument it will go to the end of the String
		System.out.println("The last 5 letters of word "+word+" are: "+sub3);
		
		String sub4 = word.substring(4);
		System.out.println("The last 5 letters of word "+word+" are: "+sub4);
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
