package HashMap;

import java.util.*;

public class NoDupicate 
{

	public static void main(String[] args) 
	{
		HashMap <Character, String> fru = new HashMap<>();
		
		fru.put('A', "Apple");
		fru.put('B', "Banana");
		fru.put('L', "Lemon");
		fru.put('G', "Grapes");
		fru.put('A', "Avocado");
		
		Set s = fru.entrySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next()+",");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
