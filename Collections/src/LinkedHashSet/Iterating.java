package LinkedHashSet;
// Java Program to Illustrate Iterating over LinkedHashSet

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
// IteratingLinkedHashSet
class Iterating 
{

	// Main driver method
	public static void main(String[] args)
	{

		// Instantiate an object of Set
		// Since LinkedHashSet implements Set
		// Set points to LinkedHashSet
		Set<String> hs = new LinkedHashSet<String>();

		// Adding elements to above Set
		// using add() method
		hs.add("Geek");
		hs.add("For");
		hs.add("Geeks");
		hs.add("A");
		hs.add("B");
		hs.add("Z");

		// Iterating though the LinkedHashSet
		// using iterators
		Iterator itr = hs.iterator();

		while (itr.hasNext())
			System.out.print(itr.next() + ", ");

		// New line
		System.out.println();

		// Using enhanced for loop for iteration
		for (String s : hs)
			System.out.print(s + ", ");
		System.out.println();
	}
}
