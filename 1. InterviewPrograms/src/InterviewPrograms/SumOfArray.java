package InterviewPrograms;

public class SumOfArray 
{

	
	public static void main(String[] args) 
	{
		int a[] = {5, 2, 7, 9, 6};
		
		int sum = 0;
		
		for (int value:a)
		{
			sum = sum + value;
		}

		System.out.println(sum);
	}

}
