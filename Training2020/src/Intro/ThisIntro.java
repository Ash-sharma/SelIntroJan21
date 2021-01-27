package Intro;

public class ThisIntro {
	
	int id ;
	String name;
	int marks;
	
	 ThisIntro(){
		 System.out.println("Hi");
	 }
	
	ThisIntro(int id, String name, int marks){
		this();
		this.id= id;
		this.name =name;
		this.marks = marks;
	}
	ThisIntro(int id){
		this(10, "n", 10);
		System.out.println(id);
	}
	
	public static void main(String args[]) {
		ThisIntro o1 = new ThisIntro(101);
//		ThisIntro o2 = new ThisIntro(102, "bbb", 55);
//		o1.display();
//		System.out.println();
//		o2.show();
		}
	
	void show() {
		System.out.println("your id is "+ id);
		System.out.println("your name is "+ name);
		System.out.println("your name is "+ marks);
	}
	
	void display(){
		this.show();
	}


}
/*this (refer to something)
 * 1. refere to the instance of the current class (obj)
 * 2. used to invoke class methods -
 * 3. use to access instance variables - 
 * 4. to invoke your constructor -  any constructor using this(para)
 * */
