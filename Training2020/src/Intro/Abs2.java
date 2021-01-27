package Intro;

public class Abs2 extends AbsIntro {
	
	void method1() {
		System.out.println("Hi I am an abstarct method");
	}
	
	public static void main (String args[]) {
		Abs2 o1 = new Abs2();
		o1.method1();
		o1.method2();
	}

}
