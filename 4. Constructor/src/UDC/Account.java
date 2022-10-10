package UDC;

public class Account 
{
	private String name;
	private String accNo;
	private double balance;
	
	public Account()   //Non-parameterized constructor
	{
		name = "";
		accNo = "";
		balance = 0.0;
	}
	
	// Parameterized constructor to directly assign values
	public Account(String n, String id, Double b)
	{
		name = n;   //Set blank string as name
		accNo = id;
		balance = b;
	}

	//Method
	public void setDetails(String n, String id)
	{
		name = n;
		accNo = id;
	}
	
	public void depositMoney(double money) 
	{
		balance = money;
		//Add money with the current balance and update balance
	}

	public void getDetails() 
	{
		System.out.println("The name of Account Holder: "+name);
		System.out.println("Account No: "+accNo);
		System.out.println("Balance: "+balance);
		System.out.println();
	}









}
