package OverRiding1;

public class Puppy extends Dogs
{
	public void movement()  //redefine movement method.
	{
		System.out.println("Calling movement method of parent class.");
		super.movement();  
		//call the movement method of parent class first
		//then print from current movement method.
		System.out.println("Puppies are cute.");
		
	}
}
