package collectionsIntro;
import java.util.LinkedList;

public class LinkedListIntro {

	public static void main (String args[]) {
		 LinkedList<String> l = new LinkedList<String>();
		 
		 // adding 
		 l.add("bb");
		 l.add("cc");
		 l.add("dd");
		 
		 // add something on the first posotion 
		 l.addFirst("aa");
		 l.addLast("zz"); //  add last
		 l.add(3, "ccc");
		 
		 //removing the elements
		 l.removeFirst();
		 l.removeLast();
		 l.remove("bb");
		 l.remove(2);
		 
		 System.out.println(l);
		 
		 Object o = l.clone(); // shallow copy 
		 System.out.println(o);
		
		
	}
	
}/* Linked List - dynamic , contain duplicates 

*/
