package Intro;

public class ConstructorIntro {
	int id;
	String name;
	
	// default / no args 
     ConstructorIntro() {
		System.out.println("Hi");
	}
     // parameterized constructor
     ConstructorIntro(int i, String b){
    	 id = i;
    	 name =b;
     }
	
	public static void main (String args[]) {
		ConstructorIntro o1 = new ConstructorIntro(1,"ash");
		ConstructorIntro o2 = new ConstructorIntro(2, "Mark");
		
		o1.show();
		System.out.println();
		o2.show();
	}
	
	void show() {
		System.out.println("your id is "+ id);
		System.out.println("your name is "+ name);
	}

}
//Consctructor
/*Special method
 * called when you are creating an object / instance of class is created 
 *used to initialize the object
 *defalut comstructor 
 *modify your default constructor
 *parameters 
 *1. default
 *2. paramterized cons
 *
 *Rules:
 *1.must have the same name as classname
 *2.must not have explicit return type
 *3.abstarct, static, final - cannot be
 * */

