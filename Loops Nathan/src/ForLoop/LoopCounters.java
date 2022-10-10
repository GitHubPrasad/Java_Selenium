package ForLoop;

public class LoopCounters 
{
	public static void main(String[] args) 
	{
		String word = "mirror";
		int rCount = 0;   // This must be initialized outside the loop
		
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == 'r')
				{
				rCount++;
				}
		}
		
		System.out.println("Your word has "+ rCount +" r(s) in it.");
		
		
	
	
	
	
	
	
	
	
	
	}

























}
