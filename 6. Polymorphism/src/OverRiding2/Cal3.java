package OverRiding2;

public class Cal3 {

	public static void main(String[] args) 
	{
		Cal1 obj = new Cal1();
		
		obj.test();
		
		obj = new Cal2();
		obj.test();
		
		System.out.println("End of Program...");

	}

}
