package Intro;

public class StringIntro {
	
	public static void main (String args[]) {
		
		String s = "hi i";                // hi i
		
		int a = s.length();
		
		char s1 = s.charAt(0);
		int index = s.lastIndexOf("i");
		
		
		boolean s3 = s.contains("Hi");  // partially matching
		boolean s2 = s.equalsIgnoreCase("HI I"); // exact matching 
		
		boolean b = s.isEmpty();
		
		String s4 = s.toUpperCase();
		String s5 = s4.toLowerCase();
		boolean s6 = s.contentEquals(s5);
		
		String s7 = s.replace("i", "e");
		char a1 = s7.charAt(3);
		
		//String[] ss = s.split(" ");
		System.out.println(s7);
		System.out.println(a1);
	
		
	}

}
