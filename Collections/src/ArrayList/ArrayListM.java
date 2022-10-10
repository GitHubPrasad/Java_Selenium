package ArrayList;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListM 
{

	public static void main(String[] args) 
	{
		ArrayList <String> countries = new ArrayList <String>();
		countries.add("India");
		countries.add("Russia");
		countries.add("Ukraine");
		countries.add("SriLanka");
		
		for(int i = 0; i < countries.size(); i++)
		{
			System.out.println(countries.get(i));
		}
	
		countries.add("Dubai");
		countries.add("Canada");
		
		for(int i = 0; i < countries.size(); i++)
		{
			System.out.println("With new elements: " + countries.get(i));
		}
	
		//sagala array print karanyasathi
		for(String a : countries)
		{
			System.out.print(a+" ");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
