package intro2;

public class Class1 {
	public int a = 10; 
	private int b = 20;
	protected int c = 30;
	
	public void m1 () {
		System.out.println("HI I am in different pacakge");
	}
	
	private void method1() {
	     System.out.println(c);
	     m1();
		}
	
	protected void m3() {
		System.out.println("hi");
	}
	
	public static void main (String [] args) {
	
	}
	
	

}
