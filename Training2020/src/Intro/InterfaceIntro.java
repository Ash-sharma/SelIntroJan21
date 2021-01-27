package Intro;

public class InterfaceIntro implements Inter1,Inter2{
    
	public void method1() {
		System.out.println("method 1");
	}
	public void method2() {
		System.out.println("method 2");
	}
	public void method3() {
		System.out.println("method 3");
	}
	
	public static void main (String args[]) {
		InterfaceIntro o1 = new InterfaceIntro();
		
		o1.method1();
		o1.method2();
		o1.method3();
	}
}
/*INterface - blueprint of a class
 * contain - static constnats or abstract methods 
 * interface keyword - create interfaces
 * you could achieve multiple inheretnece using interface
 * Rules -  All methods are abstract methods 
 *  - to inhereit interfaces : implements 
 * */
