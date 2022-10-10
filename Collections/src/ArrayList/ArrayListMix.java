package ArrayList;

import java.util.ArrayList;

public class ArrayListMix 
{

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList<>();
		
		list.add("Prasad");
		list.add(null);
		list.add(19.96);
		list.add('p');
		list.add(true);
		
		//System.out.println(list.get(0));
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		list.add("Priyanka");
		list.add(18);
		
		for(int i=0; i<list.size();i++)
		{
			System.out.println("with new elements: "+ list.get(i));
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
