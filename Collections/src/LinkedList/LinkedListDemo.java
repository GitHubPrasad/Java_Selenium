package LinkedList;

import java.util.*;

public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		//create a linked list for integer type data
		LinkedList<Integer> intlist = new LinkedList<>();
		
		//insert integer data into the list
		intlist.add(10);
		intlist.add(20);
		intlist.add(30);
		intlist.add(40);
		intlist.add(50);
	
		System.out.println("The linked list size is: " + intlist.size() + "\ncontent: " + intlist + "\n");
	
		int[] array = {5, 15, 30, 80, 60, 25};
		//an array of integers
		//create another array list with all of the items in the list
		ArrayList<Integer> arrList = new ArrayList<>();
		for(int item: array)
		{
			arrList.add(item);
		}
	
		System.out.println("The linked list size is: " + arrList.size() + "\ncontent: " + arrList + "\n");
	
		//add arrayList directly to the linked list, at the index, 2
		intlist.addAll(2, arrList);
		
		System.out.println("The linked list size is: " + intlist.size() + "\ncontent: " + intlist + "\n");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
