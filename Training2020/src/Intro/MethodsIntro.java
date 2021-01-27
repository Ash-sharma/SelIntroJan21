package Intro;

public class MethodsIntro {
	
	public static void main(String args[]) {
		MethodsIntro o1 = new MethodsIntro();
		
		int additionresult = add(2, 2);
		int addresult2 = add(2, 3);
		
		System.out.println(additionresult);
		
		System.out.println(o1.sub(2, 2));
		o1.div(5, 10);
		
		System.out.println(o1.mul(additionresult, 5));
	}
	
	static int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return b-a;
	}
	int div(int a, int b) {
		return b/a;
	}
	int mul(int a, int b) {
		return b*a;
	}

}

/*Methods
 * return datatype methodname (parametes ){
 * code block
 * }
 * 
 * static - no instantiation is required 
 * */
