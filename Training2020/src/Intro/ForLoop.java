package Intro;

public class ForLoop {
	public static void main(String args[]) {
//		for(int x =1;x<=5;x++ ) {
//			System.out.println(x);
//		}
		// nested for Loop
//		for(int x =1;x<=5;x++ ) {
//			for(int y = 1; y<5;y++) {
//				System.out.print(y);
//			}
//			System.out.println("- Loop"+x+ " of X");
//		} 
		
		for (int i=1;i<=10; i++) {
			if(i==5) {
//				break;
				continue;
			}
			System.out.println(i);
		}
		
		
	}
}
/* for loop 
 * for(initialization; condition; increment/decrement)
 * {Code block}
 * 
 * nested for loop
 * 
 *advanced for loop or for each loop
 * for(Datatype variable: array){
 * }
 * 
*/
