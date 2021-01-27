package Intro;

public class OverridingIntro extends OvdrloadingIntro {
	
	
	void sub (int a, long b) {
		System.out.println("subtracting "+ b + " from " + a);
	}
	
	public static void main1() {
		System.out.println("b");
	}
	
	public static void main (String [] args) {
		OverridingIntro o1 = new OverridingIntro();
		o1.sub(10, 5);
		main1();
	}

}/*
Overriding- if childclass has the same method as declared in the parent class
RUles - 
1.the method msut have the same name
2.the method must have same number of pararmeters as the parent class method
3. inheretnece must be established  
Runtime polumorphism 
Q1 - Can you override static methods ? No 
*/
