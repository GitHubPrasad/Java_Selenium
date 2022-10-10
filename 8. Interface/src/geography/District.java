package geography;

public class District 
{
	String name;
	int code;
	String attraction;
	
	public District()
	{
		name = "Kolhapur";
		code = 9;
		attraction = "Panhala Fort";
			
	}

	public void print()
	{
		System.out.println("Name: "+name+"\n"+"Code: "+code+"\n"+"Attraction: "+attraction+"\n");
	}

}
