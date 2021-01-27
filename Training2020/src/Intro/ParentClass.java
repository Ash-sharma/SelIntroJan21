package Intro;

public class ParentClass {
	
	ParentClass(){
		System.out.println("Parent");
	}
	
	String s = "P class variable";
	
	void method1() {
		System.out.println("HI I am in parent class");
	}

	void method2() {
		System.out.println("HI I am in parent class method 2");
	}

}
/*Inheretnece - to acquire all teh properties and behaviours of a parent class
 * Parent class  -  which has defined all the props and behaviours
 * child class/ sublass -  whic inherits the parent class
 * user keyword extends - to inherit parent class
 * 
 * Types of inheretnece:
 *  1. SIngle  - y
 *  2. Multilevel - y
 *  3. Hierarchical - y
 *  4. multiple - N 
 *  5. Hybrid - N
 *  
 *  Keyword super - to refer the prent class object
 *                - invoke parent class methods
 *                 - instance variables of the parent class
 *                 - constructor of the parent class 
 * */
