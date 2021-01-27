package collectionsIntro;
import java.util.*;

public class IteratorIntro {

	public static void main (String args[]) {
		
		ArrayList <String> a = new ArrayList<String>();
		
		a.add("aaa");
		a.add("bb");
		a.add("cc");
		a.add("dd");
		
		// for each loop
		// iterator 
		Iterator i = a.iterator();
		
		while(i.hasNext()) {
			Object s = i.next();
			System.out.println(s);
		}
		
		
		
		
	}
	
}
