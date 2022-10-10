package UDC;

public class Bank 
{

	public static void main(String[] args) 
	{
		//Non-parameterized constructor will work
		Account acc1 = new Account();
		//Parameterized constructor will work
		Account acc2 = new Account("John","123",500D);

		//Set details for account 1
		acc1.setDetails("Gaurav", "7020");
		acc1.depositMoney(6000D);
	
		//Display the account details
		System.out.println("Details of Account 1: ");
		acc1.getDetails();
		System.out.println("Details of Account 2: ");
		acc2.getDetails();
		
	
	
	
	
	}












}
