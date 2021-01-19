package p1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderIntro {
	
	@DataProvider(name = "new-Data")
	public Object[][] methoda(){
		return new Object[][] {{"first value"}, {"second value"}, {"hi i am third"}};
	}
	
	@DataProvider (name = "numericData")
	public Object[][] methodB(){
		return new Object[][] {{2,3,1},{4,5,1}};
	}
	
//  @Test (dataProvider = "new-Data")
//  public void m1(String s) {
//	  System.out.println(s);
//  }
  
  @Test(dataProvider = "numericData")
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}

}
/* one of ways to provide data to your mtethod 
 * @DataProvdier 
*/
