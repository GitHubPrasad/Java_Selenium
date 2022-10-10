package ArrayList;

//Java Program to Change elements in ArrayList

//Importing all utility classes
import java.util.*;

//main class
class ArraySet {

	// Main driver method
	public static void main(String args[])
	{
		// Creating an Arraylist object of string type
		ArrayList<String> al = new ArrayList<>();

		// Adding elements to Arraylist
		// Custom input elements
		al.add("Prasad");
		al.add("Patil");

		// Adding specifying the index to be added
		al.add(1, "Patil");

		// Printing the Arraylist elements
		System.out.println("Initial ArrayList: " + al);

		// Setting element at 1st index
		al.set(1, "Vijay");

		// Printing the updated Arraylist
		System.out.println("Updated ArrayList: " + al);
	}
}
