package LinkedHashSet;

import java.awt.print.Book;
import java.util.LinkedHashSet;

public class Book2 extends Book1
{

	public Book2(float id, String name, String author, String publisher, int quantity) 
	{
		super(id, name, author, publisher, quantity);
		
	}

	public static void main(String[] args) 
	{
		LinkedHashSet<Book1> hs = new LinkedHashSet<Book1>();
		
		//Creating Books
		Book1 b1 = new Book1(1.1f, "Yayati", "V. S. Khandekar", "BPB", 100);
		
		Book1 b2 = new Book1(1.2f, "Chava", "Vishwas Patil", "Man", 50);
	
		Book1 b3 = new Book1(1.3f, "Isapniti", "Prasad Patil", "Parijat", 7020);
	
	    //Adding Books to hash table  
	    hs.add(b1);  
	    hs.add(b2);  
	    hs.add(b3);  
	
	    //Traversing hash table  
	    for(Book1 b:hs)
	    {  
	    System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", "+b.quantity);
	    }
	}

}
