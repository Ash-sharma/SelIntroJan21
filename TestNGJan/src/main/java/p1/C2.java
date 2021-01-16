package p1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C2 {
	@Test
	 public void m1() {
		System.out.println("Testing");
			}
		
		@Test
		public void m2() {
			System.out.println("method 2 is running");
				}

		@Test (enabled = false)
		public void m3() {
			System.out.println("method 3 is running");
				}
		@Test
		public void m4() {
			System.out.println("mthod 4");
		}
//		@BeforeClass
//		public void m23() {
//			System.out.println("I run before your class");
//		}
//		@AfterClass
//		public void m24() {
//			System.out.println("I run after your class");
//		}
}
