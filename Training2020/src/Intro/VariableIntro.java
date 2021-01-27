package Intro;

public class VariableIntro {
	int x =2; // instance varaible 
	static int y = 0; //  static variable 

	// main method - it is used to print outputs // start the execution
	public static void main (String args[]) {
		int a = 100;

	VariableIntro ob1 = new VariableIntro();
	System.out.println(ob1.x);
	System.out.println(y);
	}
	// make other methods 
	// return datatype  - method name (parameters)
      void Method1 () {
    	  int xx = y++;
    	System.out.println(); 
      }
      
      void method2() {
    	  int xx = y++;
      }
      
      
}
/* 3 types of varialbles 
 *  - local variable  - varaiable declared inside of a method 
 *  - instance variable - defined inside class but outside any method
 *  - static varaibles - 
 * */

// Static keyword - you don't have make an object to call any static method, vaiable, blocks
 