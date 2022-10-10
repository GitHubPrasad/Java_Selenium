package LinkedList;

import java.util.*;

public class LinkedListRemoveElements 
{

	public static void main(String[] args) 
	{
		LinkedList<String> hp = new LinkedList<>();
		   
        hp.add("Dell");
        hp.add("Asus");
        hp.add(1, "Leneovo");
   
        System.out.println("Initial LinkedList " + hp);
            
        hp.remove(1);
   
        System.out.println("After the Index Removal " + hp);
         
        hp.remove("Asus");
   
        System.out.println("After the Object Removal " + hp);
            

	
	
	
	
	
	
	
	
	
	}

}
