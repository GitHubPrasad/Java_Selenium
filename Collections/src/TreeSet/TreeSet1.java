package TreeSet;

import java.util.*;

public class TreeSet1 
{

	public static void main(String[] args) 
	{
		TreeSet<String> name = new TreeSet<>();
		
		name.add("A");
		name.add("B");
		name.add("C");
		name.add("D");
		name.add("E");
		name.add("F");
		
		//traversing elements
		Iterator<String> itr = name.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		//reverse
		Iterator<String> rev = name.descendingIterator();
		while(rev.hasNext())
		{
			System.out.println(rev.next());
		}
		
		//Integer TreeSet
        
		TreeSet<Integer> set=new TreeSet<Integer>();  
        set.add(24);  
        set.add(66);  
        set.add(12);  
        set.add(15);  
           
        System.out.println();
 		          
        Iterator<Integer> no = set.iterator();
 		while(no.hasNext()) 
 		 {
 			System.out.println(no.next());
 		 }
	
 		 
 		//reverse
 		Iterator<Integer> reve = set.descendingIterator();
 		while(reve.hasNext())
 		   {
 			System.out.println(reve.next());
 		   }
	
 		System.out.println("Highest Value: "+set.pollFirst());  
        System.out.println("Lowest Value: "+set.pollLast());
	
	
	
	
	
	
	
	
	
	
	
	}
}
