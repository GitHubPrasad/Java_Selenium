package HashMap;

import java.util.*;

public class Changing 
{

	public static void main(String[] args) 
	{
        // Initialization of a HashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
            
 
        // Change Value using put method
        hm.put(1, "selenium");
        hm.put(2, "and");
        hm.put(3, "Automation");
 
        System.out.println("Initial Map " + hm);
 
        hm.put(2, "Based");
 
        System.out.println("Updated Map " + hm);

	}

}
