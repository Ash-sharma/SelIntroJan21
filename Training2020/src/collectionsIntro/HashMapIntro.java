package collectionsIntro;
import java.util.*;

public class HashMapIntro {

	public static void main (String args[]) {
	 HashMap<Integer, String> hm = new HashMap<Integer, String>();
	 
	 // to add elements 
	 hm.put(3, "Apple");
	 hm.put(1, "Cat");
	 hm.put(2, "Bat");
 
	 System.out.println(hm);
	 // remove
	 hm.replace(3, "Eat");
	 
	 // iterate through this hashmap
	 for (Map.Entry m: hm.entrySet()) {
		 System.out.println( m.getKey()+" " + m.getValue());
		  }
	 
	 
	 // lInkedHasMap
	 LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>();
	 
	 hm1.put(3, "Apple");
	 hm1.put(1, "Cat");
	 hm1.put(2, "Bat");
	 
	 System.out.println(hm1);
	 
	 // TreeMap
	 TreeMap <Integer, String> hm2 = new TreeMap<Integer, String>();
	 hm2.put(3, "Apple");
	 hm2.put(1, "Cat");
	 hm2.put(2, "Bat");
	 
	 System.out.println(hm2);
	}
}

/*to iterate 
 * 1. User entryset()  method to get the pairs in a set
 * 2. Map.Entry method to access each pair in the set
 * 
 * Map.Entry -  intreface which enables you to work with each entry of 
 * 				of the map
 * entry.set() - captures each entry as set of k,v 
 * */
