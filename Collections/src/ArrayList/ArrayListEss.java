package ArrayList;

import java.util.ArrayList;

public class ArrayListEss 
{

	public static void main(String[] args) 
	{
		//create an array list for string type object
		ArrayList <String> city = new ArrayList <String>();

		//add items in the array list
		city.add("Banglore");
		city.add("Hyderabad");
		city.add("Pune");
		city.add("Mumbai");
		
		//number of elements
		System.out.println("The size of the array list: " + city.size());
		
		//display the content of the array list
		System.out.println("Cities are: " + city);
	
		//display content of the array list one by one
		for(String cities: city)
		{
			System.out.println(cities);
		}
	
		//insert another city at the index 2 in city list
		city.add(2, "Kolhapur");
		System.out.println("Cities: " + city);
		
		
	
	}

}
