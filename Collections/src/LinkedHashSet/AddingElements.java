package LinkedHashSet;

import java.util.*;

public class AddingElements 
{

	public static void main(String[] args) 
	{
        // Creating an empty LinkedHashSet
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
 
        // Adding elements to above Set
        // using add() method
 
        // Note: Insertion order is maintained
        hs.add("Prasad");
        hs.add("Vijay");
        hs.add("Patil");
 
        // Printing elements of Set
        System.out.println("LinkedHashSet : " + hs);
    
        Iterator<String> i = hs.iterator();
        
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
	
	
	
	
	
	
	
	}	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


