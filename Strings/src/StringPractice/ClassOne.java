package StringPractice;

public class ClassOne 
{

	public static void main(String[] args) 
	{
//		String Literals
//		Only on object created in String Pool Area.
		String str = "string1"; // 1        
		String str1 = "string1";
		String str2 = "string3";// 2
		String str3 = "string4"; // 3
		
		String str4 = new String("string1"); // 5
		String str5 = new String("string1"); // 6
		String str6 = new String("string7"); // 8
		String str7 = new String("string8"); // 10
		
		if(str == str1){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
		if(str4 == str5){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		

	}

}
