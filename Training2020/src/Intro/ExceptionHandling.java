package Intro;

import java.io.IOException;

public class ExceptionHandling {
	
	static void m1(int a) {
		if(a<10)
		{
			throw new ArithmeticException("invalid");
		}
		else {System.out.println("you passed");}
	}
	
	// throws
	static void m2()throws ArithmeticException, IOException, ArrayIndexOutOfBoundsException{
		int a = 1/0;
//		throw new IOException("some error");
	}
   
    public static void main (String args[]) {
    	
    	try{m2();}
    	catch (Exception e) {
    		System.out.println("mmm");
    	}
    	m1(9);
    
    String s = null;
    
    try {
    int aa[] = new int [5];
    System.out.println(aa[6]);
    }
    catch(ArithmeticException e) {
//    	System.out.println(e);
    	System.out.println("Handeled your exception please continue");
    }
    catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println("index doesn't exists");
    }
    catch (Exception e) {
    	System.out.println("mmmm");
    }
    	
    System.out.println("aa");
    	
    	
    	
    }
}/* try {} catch(exception_class){}
   try{} finally()
   nested try and catch blocks 
   
   throw - used to explicitly throw an exception
   throw new execption;
   
   throws - keyword declare an exception
   method() throws execption classname{}
*/
