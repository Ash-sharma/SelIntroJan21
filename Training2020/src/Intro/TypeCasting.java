package Intro;

public class TypeCasting {
	
	public static void main (String args[]) {
		//Widening Casting
		byte a = 1;
		short b = a;
		int c = b;
		int d = 100;
		long e = d;
		float f= e;
		double g = f;
		// Narrowing Casting 
		double i = 8.88;
		int h = (int)i;
		float j = 10.00f;
		short k = (short)j;
		System.out.println(j);
		System.out.println(k);
	}

}
// type casting 
/* 1. Widening Casting (automaically)
 * byte > Short > int > long >float > double
 * 2. Narrowing Casting (manually)
 * Double >float> long> int> short> byte
 * */
 