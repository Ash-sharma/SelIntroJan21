package collectionsIntro;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntro {
	
	public static void main (String args[]) {
		ArrayList<String> l = new ArrayList<String>();
		
	      // add data 
		l.add("aa");
		l.add("bb");
		l.add("cc");
		l.add("dd");
		
		l.add(1,"ee"); // to add at any specific index
		l.set(2, "ff"); //  replcaes the value 
		l.remove(4); // removing using index
		l.remove("cc"); // remove using object value
		System.out.println(l.size());
		
		// Interating 
		for(String e: l) {
			System.out.println(e);
		}
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("zz");
		l1.add("vv");
		l1.add("ss");
		
		int a = l1.indexOf("zz");// top find indexes
		String b= l1.get(1); // to get vakues using index
		boolean c = l1.contains("aa");
		System.out.println(c);
	
		
		System.out.println("List before it was sorted "+ l1);
		// sorting an arraylist
		Collections.sort(l1);
		System.out.println(l1);
		
		l1.clear(); // to remove all elements 
		System.out.println(l1);
		
		
	
	}

}

/*ArrayList: 1. It's dynamic in size
 * 2. It can store dupllicate elements
 * 3. maintians the insertion order 
 * 4. it allows to randomly accefss any data using indexes
 * 
 * int - primitive data 
 * non primitve -  String 
 * Integer
 * 
 * collections works 
 * */
