package p1;
import org.testng.annotations.Test;

public class ParallelIntro {
	
	@Test
	public void test3() {
		for(int i = 1; i<= 10; i++) {
			System.out.println(i  +" "+ Thread.currentThread().getId());
		}
	}
	@Test
	public void test4() {
		for(int i = 100; i< 110; i++) {
			System.out.println(i +" "+ Thread.currentThread().getId());
		}
	}

}
/*Parallel
 *  - Methods
 *  - Classes
 *  - Tests 
 * */
