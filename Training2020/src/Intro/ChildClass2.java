package Intro;

public class ChildClass2 extends ParentClass{
	
	void bb() {
		System.out.println("Child CLass 2 method");
	}
	
	public static void main (String args[]) {
		ChildClass2  o1 = new ChildClass2();
		o1.bb();
//		o1.a();
		o1.method1();
	}

}
