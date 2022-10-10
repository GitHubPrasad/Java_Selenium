package Strings;

public class RemoveJunkFromString 
{

	public static void main(String[] args) 
	{
		String str = "$@%^@Prasad";
		
		str = str.replaceAll("[^a-zA-Z0-9)]", "");
		
		System.out.println(str);
		
		
		

	}

}
