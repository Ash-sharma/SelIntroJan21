package Intro;

public class ChildClass extends ParentClass {
	
	ChildClass(){
		super();
	}
	
	void a () 
	{
		
		System.out.println("hi I am in child class");
		System.out.println(super.s);
		super.method1();
		
	}
	
	public static void main(String args[]) {
		ChildClass o1 = new ChildClass();
		
		o1.a();
//		o1.method1();
		o1.method2();
		
		}

}
