package Intro;

public final class FinalKeword {
	static final int a =10;
	
	final void m1() {
		System.out.println(a);
	}
	
	public static void main (String args[]) {
		FinalKeword o = new FinalKeword();
		System.out.println(a);
		
	}
	
	

}/* Final : cannot be changed
used on : variables , methods // no override , class (cannot be extended)
*/
