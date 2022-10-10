package HashMap;

import java.util.*;

public class NonGeneric 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Prasad");
		hm.put(2, "Vijay");
		hm.put(3, "Patil");
		hm.put(4, "Parijat");
		
		//converting to set so that we can traverse
		Set set = hm.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
