package LinkedHashSet;

import java.util.*;

public class RemovingElements 
{

	public static void main(String[] args) 
	{
		// Creating an empty LinekdhashSet of string type
		HashSet<String> rm = new HashSet<>();
		
        // Adding elements to above Set
        // using add() method
		rm.add("hp");
		rm.add("dell");
		rm.add("acer");
		rm.add("lenovo");
		rm.add("msi");
		
		//number of elements in array
		System.out.println(rm.size());
		
		// Printing elements of Set
        System.out.println("LinkedHashSet : " + rm);
        
        // Removing the element from above Set
        rm.remove("hp");
		System.out.println("LinkedHashSet : " + rm);

        // Returning false if the element is not present
        System.out.println(rm.remove("asus"));
	
	
	}

}
