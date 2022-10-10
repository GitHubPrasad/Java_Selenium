package StringEss;

import java.util.*;

public class String1 
{
	public static void main(String[] args) 
	{
	char[] charString = {'s','t','r','i','n','g'}; //an array of characters.
	String str = new String(charString); //make string from the character array
	System.out.println("The value of string is: "+str);
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter string: ");
	str = scanner.next();   //get the string from the user
	
	str = "JAVA Strings";  //direct assign string to the string type object str
	System.out.println("The value of str is: "+str);
	
	str = "String"+" "+"Concatenate";  //concatenate three strings into single string
	System.out.println("The value of str is: "+str);
	
	scanner.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}





















}
