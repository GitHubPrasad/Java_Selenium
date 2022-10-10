package InterviewPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile 
{

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("\\D:\\JAVA\\Net Programs\\Static override.txt\\");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Prasad");
		bw.write("Patil");;
		
		System.out.println("Finished...");
		
		bw.close();
		
		
		
		
		
		
		
		
		
		

	}

}
