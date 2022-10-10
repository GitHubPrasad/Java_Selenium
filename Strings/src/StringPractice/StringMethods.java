package StringPractice;

public class StringMethods 
{

	public static void main(String[] args) 
	{
		//Concatenate
		String a1 = "Prasad";
		String a2 = "Vijay";
		String a3 = "Patil";
		System.out.println("Concatenated string is: " + a1.concat(a3));
		
		String a4 = a1.concat(a2);
		System.out.println("Concatenated string is: " + a4.concat(a3));
		
		//Equality
		String b1 = "Nezuko";
		String b2 = "Nezuko";
		String b3 = "tanjiro";
		
		boolean out = b1.equals(b2);
		System.out.println("Equality check: " + out);
		
		boolean outu = b1.equals(b3);
		System.out.println("Equality check: " + outu);
		
		// Converting cases
		String word1 = "AUTOMATION";
		System.out.println("Changing to lower Case: " + word1.toLowerCase());
	
		String word2 = "automation";
		System.out.println("Changing to lower Case: " + word2.toUpperCase());
	
		// Trimming the word
		String fullName = " Prasad Vijay Patil ";
		System.out.println("Trim the word: " + fullName.trim());
	
		String full = " Prasad-Vijay-Patil ";
		System.out.println("Trim the word: " + full.trim());
	
//		IMPORATANT
		//Split
		String str = "Kollar-Gold-Fields-Chapter2";
		String[] arrStr = str.split("-");
		for(int i = 0; i < arrStr.length; i++)
			System.out.println(arrStr[i]);
	
		String stp = "Shivaji-Nagar-Lane PethVadgaon";
		String[] arrStp = stp.split(" ");
		for(int i = 0; i < arrStp.length; i++)
			System.out.println(arrStp[i]);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
