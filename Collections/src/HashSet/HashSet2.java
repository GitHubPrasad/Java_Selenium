package HashSet;

import java.util.*;

public class HashSet2 
{

	public static void main(String[] args) 
	{
		HashSet<String> name = new HashSet<>();
		
		name.add("Prasad");
		name.add("Priyanka");
		name.add("Patil");
		name.add("PethVadgaon");
		name.add("Prasad");
		name.add("Kolhapur");
		name.add("Priyanka");
	
		Iterator<String> i = name.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
	
	
	
	
	
	}

}
