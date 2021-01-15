package p1;

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
}
