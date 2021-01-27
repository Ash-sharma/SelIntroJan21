package Intro;

abstract class AbsIntro {
	
	// abstract methods  - whose implemtation are not defined
	abstract void method1();
	
	void method2() {
		System.out.println("Concerte method");
	}

}
/*Abstraction  - process of hiding the impelmentation details 
 * and just showing the functionality 
 * abstarct keyword  -  implement abstraction 
 * Points to remeber: 
 *  1. class must be declared with abstract keyword
 *  2. it can have abstract methods as well non abstarct methods
 *  3. cannot be instantitated 
 *  4. It can have constructors and static methods
 *  5. It can have final methods
 *  6. all abstract methods needs be implemneted in thechild class
 * */
