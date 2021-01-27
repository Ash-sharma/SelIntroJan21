package Intro;

public class ArryasIntro {

	public static void main(String args[]) {
		// instantiation array
		int a1[] = new int[5];
		// initialize
		a1[0] = 10;
		a1[1] = 20;
		a1[2] = 30;
		a1[3] = 40;
		a1[4] = 50;	
		
		int a2[]= {10,20,30,40,50}; // decalring, instantiation, initialziing
		
		// anonymous Array - not declared
		
//		System.out.println(a1);
	
		
//		 traverse an array - for loop
		for(int x=0; x<=a1.length; x++) {
			System.out.print(a1[x]+ " ");
		}
		
		// for each loop
//		for(int x:a2) {
//			System.out.print(x+ " ");
//		}
		
//		printArray(new int[] {1,2,3,4,5}); // anonymous array
		//new int[] {values} , anonymous array
		
	}
	///////////////////////////////////////////
	
//	static void printArray(int a[]) {
//		for(int x= 0; x<a.length; x++) {
//			System.out.print(a[x]);
//		}
//	}
	
	
	
}/*
It is an object which contans elements of same datatype 
they stored in contiguous memory location 
you can only store fixed set of elements
syntax
1. datatype arrayname[] = new dataype[size] //instantiation of array
2. 

for(Datatype variable: array){
 * }
*/
