package ForLoop;

public class ForLoopWithString
{
	/*public static void main(String[] args) 
	{					
		String word = "Barefoot";
		// length = 123456
		// Indexes = 012345
		// Strings have a fixed length
		// String length starts at 1
		// Indexes start at 0
		// Lenght is always one longer than the index is.
	}*/

	public static void main(String[] args) 
	{
		String word = "repaid";
		
		
		for(int i = 0; i < word.length(); i++)
		{
			System.out.print(word.charAt(i));
		}
	


		for(int i = 0; i < word.length(); i++)
		{
			System.out.print(word.substring(i, i+1));
		}
	

		// Reverse Wording
		for(int i = word.length() - 1; i >= 0 ; i--)
		{
			System.out.print(word.charAt(i));
		}
	
	
	
	
	
	
	
	
	}





}
