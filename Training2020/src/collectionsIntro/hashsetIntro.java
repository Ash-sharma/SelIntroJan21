package collectionsIntro;
import java.util.*;
public class hashsetIntro {

	public static void main (String args[]) {
		
		HashSet<String> h = new HashSet<String>();
		
		// add 
		h.add("mike");
		h.add("nike");
		h.add("bike");
		h.add("mike");
		
		System.out.println(h);
		
		// linked hashset
		LinkedHashSet<String> h1  = new LinkedHashSet<String>();
		
		h1.add("zebra");
		h1.add("apple");
		h1.add("banana");
		h1.add("dog");
		h1.add("zebra");
		System.out.println(h1);
		
		
		// Treeset
		TreeSet<String> h2 = new TreeSet<String>();
		h2.add("zebra");
		h2.add("apple");
		h2.add("banana");
		h2.add("dog");
		
		System.out.println(h2);
		
		
		
		
		
	}
	
}
