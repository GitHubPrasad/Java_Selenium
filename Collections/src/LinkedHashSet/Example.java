package LinkedHashSet;

import java.util.*;

public class Example 
{

	public static void main(String[] args) 
	{
		//Creating HashSet and adding elements  
        
		LinkedHashSet<String> set=new LinkedHashSet();  
               set.add("One");    
               set.add("Two");    
               set.add("Three");   
               set.add("Four");  
               set.add("Five");  
               
               Iterator<String> i=set.iterator();  
               
               while(i.hasNext())  
               {  
               System.out.println(i.next());  
               }  
	
	}

}
