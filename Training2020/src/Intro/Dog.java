package Intro;

public class Dog {
	String colour = "black"; // state of the object, instance variables 
	String tail = "small";
   String colour2 = "brown";
   String colour3 = "white";
	
	public static void main (String args[])
	{
		Dog bulldog = new Dog();  // obj1
		Dog pomerian =  new Dog(); // obj 2
		Dog puppy = new Dog();
		System.out.println(bulldog.colour);
		System.out.println(pomerian.colour3);
		System.out.println(puppy.colour2);
		bulldog.bark();
		puppy.run();
	}
	
	
	void bark() {
		System.out.println("Woof Woof");
	}
	
	void run() {
		System.out.println("The dog is running");
	}

}
