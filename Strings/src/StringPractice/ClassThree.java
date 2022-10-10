package StringPractice;

public class ClassThree 
{
//	Object Comparison
	public static void main(String[] args) 
	{
		String p1 = "Prasad";
		String p2 = "Prasad";
		String p3 = "Prasad";  //1
		String p4 = "Priyanka"; //2
		String p5 = "Patil";  //3
		
		System.out.println(p1 +" & "+ p4);
		
		System.out.println("The word is: "+p1);
		System.out.println("The word is: "+p2);
		System.out.println("The word is: "+p3);
		System.out.println("The word is: "+p4);
		System.out.println("The word is: "+p5);
		
		String p6 = new String("Prasad");  //6
		String p7 = new String("Peth Vadgaon");
		String p8 = new String("Kolhapur");
		String p9 = new String("Priyanka");
		String p10 = new String("Kolhapur");
		
		System.out.println("The word is: "+p6);
		System.out.println("The word is: "+p7);
		System.out.println("The word is: "+p8);
		System.out.println("The word is: "+p9);
		System.out.println("The word is: "+p10);
		
		p3 = "Java";  //Error: Duplicate local variable
		System.out.println("Other word for p3 is: "+p3);
	
		//First: true
		if(p1 == p2){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
		//Second: false
		if(p8 == p10){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	
		//Third: false
		if(p1 == p6){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	
	
	
	
	
	
	
	
	}

}
