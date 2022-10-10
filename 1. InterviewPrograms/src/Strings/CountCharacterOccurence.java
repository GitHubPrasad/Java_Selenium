package Strings;

public class CountCharacterOccurence 
{

	public static void main(String[] args) 
	{
		String str = "Java Programming Java OOPS";
		
		int totalcount = str.length();	//total length of a string
		
		int totalcount_withouta = str.replace("a", "").length();	//total length after removing a's
		
		int count = totalcount - totalcount_withouta;
		
		System.out.println("no. of occurences of a is: "+count);

	}

}
