package InterviewPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromTextFile 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("\\D:\\JAVA\\Net Programs\\Static override.txt\\");
		
		Scanner sc = new Scanner(file);
		
		//Method 1
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		
		//Method 2
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
		
		
		
		
		
		
		
		

	}

}
