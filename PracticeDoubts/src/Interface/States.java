package Interface;

//This is the concept of Multiple Inheritance is achieved
//In child class (implementations class) same method from Bharat & India is Inherited

public class States implements India, Bharat
{
	@Override
	public void Maharashtra()
	{
		System.out.println("Pune");
	} 
	
	@Override
	public void Karnataka()
	{
		System.out.println("Banglore");
	}
	
	@Override
	public void Telangana()
	{
		System.out.println("Hyderbad");
	}

	@Override
	public void Gujrat() 
	{
		System.out.println("Ahmedabad");		
	}

	@Override
	public void Punjab() 
	{
		System.out.println("Chandighar");
	}

	@Override
	public void Kashmir() 
	{
		System.out.println("Shrinagar");
	}
	
}
