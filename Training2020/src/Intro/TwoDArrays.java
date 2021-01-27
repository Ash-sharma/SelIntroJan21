package Intro;

public class TwoDArrays {

	public static void main(String args[]) {
		
		int a1[][] = new int[2][2];// 2rows & 2 columns
		
		a1[0][0]= 10;
		a1[0][1] = 20;
		a1[1][0] = 30;
		a1[1][1] = 40;
		
		int a2[][] = {{10,20},{30,40}};
		
		// traverse a 2-D array
		for(int x =0 ;x<a1.length;x++) {
			for(int y = 0; y<a1.length;y++) {
				System.out.print(a1[x][y]+ " ");
			}
			System.out.println();
			
		}
		
		// jagged array
		int a3[][] = new int[3][];
		a3[0] = new int[4];
		a3[1] = new int[2];
		a3[2] = new int[3];
	
		
		
		
		
	}
	
}
