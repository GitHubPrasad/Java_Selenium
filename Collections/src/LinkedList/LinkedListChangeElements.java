package LinkedList;

import java.util.*;

public class LinkedListChangeElements 
{

	public static void main(String[] args) 
	{

        LinkedList<String> kgf = new LinkedList<>();
   
        kgf.add("Kollar");
        kgf.add("Fields");
        kgf.add(1, "Silver");
   
        System.out.println("Initial LinkedList: " + kgf);
   
        kgf.set(1, "Gold");
   
        System.out.println("Updated LinkedList: " + kgf);

	}

}
