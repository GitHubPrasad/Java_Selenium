package ArrayList;

import java.io.*;
import java.util.*;

class ArrayOpe {
	public static void main(String[] args)
	{
		// Size of the
		// ArrayList
		int n = 5;

		// Declaring the ArrayList with
		// initial size n
		ArrayList <Integer> arr = new ArrayList <Integer>(n);
		
		// Appending new elements at
		// the end of the list
		for (int i = 1; i <= n; i++)
			arr.add(i);

		// Printing elements
		System.out.println(arr);

		// Remove element at index 3
		arr.remove(3);

		// Displaying the ArrayList
		// after deletion
		System.out.println(arr);

		// Printing elements one by one
		for (int i = 0; i < arr.size(); i++)
			System.out.println(arr.get(i) + " ");
	}
}
