package InterviewPrograms;

public class CountEvenOddDigits 
{

	public static void main(String[] args) 
	{
		int num = 1234;
		int evencount = 0;
		int oddcount = 0;

		while(num>0) //1234  //123  //12  //1
		{
			int rem = num%10;  //4  //3  //2  //1
			
			if(rem % 2 == 0)
			{
				evencount++;  //1  //2
			}
			else
			{
				oddcount++;  //1  //2
			}
			
			num = num/10;  //123  //12  //1  //0
		}
		
		System.out.println("Number of Even Digits: "+evencount);
		System.out.println("Number of Odd Digits: "+oddcount);
		
		
		
		
		
		
		
		
		
	}

}
