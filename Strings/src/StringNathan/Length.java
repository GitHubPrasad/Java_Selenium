package StringNathan;

public class Length 
{

	public static void main(String[] args) 
	{
		String word = "Barefoot";
		
		int len = word.length();
		
		System.out.println("The length of word "+word+" is: "+len);
		System.out.println("The length of word "+word+" is: "+word.length());
		
		//Finding last letter of word:
		//using charAt
		char lastletter = word.charAt(word.length()-1);
		System.out.println("The last letter is: "+lastletter);

		//using substring
		System.out.println("The last letter is: "+ word.substring(word.length()-1, word.length()));
		System.out.println("The last letter is: "+ word.substring(word.length()-1));

	
	
	
	
	
	}

}
