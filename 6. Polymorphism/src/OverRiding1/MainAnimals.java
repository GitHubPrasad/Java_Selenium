package OverRiding1;

public class MainAnimals 
{
	public static void main(String[] args) 
	{
		PetAnimal animal = new PetAnimal();  //set animal as a object of PetAnimal Class.
		animal.movement();  //method is called through animal object.(Method calling through object)
		// here animal object is reference of Parent Class PetAnimal.
		
		animal = new Dogs();  //Parent class chya reference madhe child class cha object store karane.
		
		/*object_of_parent_class = new Child_class*/
		
		animal.movement();
		
		animal = new Puppy();
		animal.movement();
		
		System.out.println("End of Program...");
		
	}
}
