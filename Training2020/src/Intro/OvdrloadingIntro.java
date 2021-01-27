package Intro;

public class OvdrloadingIntro {
	
	int sum (int a, int b) {
		return a+b;
	}
	
	String sum (String a, int b) {
		return a+b;
	}
	
	void sub (int a, long b) {
		System.out.println(b-a);
	}
	
	public static void main(String args) {
		System.out.println("No array");
	}
    public static void main() {
    	System.out.println("blank");
	}
	
	public static void main (String args[])
	{
		OvdrloadingIntro o1 = new OvdrloadingIntro();
		o1.sum("1",2);
		o1.sub(5, 10);
		System.out.println("with array");
		main("a");
	}
	

}
/*Overloading  / / compile time polymorphism 
 * method can have a same but different follwoing things
 * - number of parameters 
 *  - changing the data type of the parameters 
 *  Q1. Why overloading is not possible by changing return type
 *  Q2. Can we overload main method()? Yes
 *  Type promotion in overloading  -  basic casting widneing nand noarrowing
 * byte- short - int - long - float  - double
 *                |
 *               char
 * */
