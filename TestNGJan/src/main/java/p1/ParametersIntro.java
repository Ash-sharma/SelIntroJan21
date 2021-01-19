package p1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersIntro {
	
	@Test
	@Parameters ({"x","y"})
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	@Test
	@Parameters ({"xx","yy"})
	public void sub(int a, int b) {
		System.out.println(b-a);
	}

}
/*parameters annotation 
 * @parameters 
 */
 
