package p1;

import org.testng.annotations.Test;

public class Attriibutes {
	
	@Test (description = "This test is for sign in")
	public void m1() {
		System.out.println("in method 1");
	}
	
	@Test (timeOut = 200)
	public void m2() {
		System.out.println("in method 2");
	}
	@Test(priority =2)
	public void m3() {
		System.out.println("in method 3");
	}
	@Test(priority =1)
	public void m4() {
		System.out.println("in method 4");
	}
	@Test(dependsOnMethods = {"m6"})
	public void m5() {
		System.out.println("in method 5");
	}
	@Test
	public void m6() {
		System.out.println("in method 6");
	}
	
	
	
}/*
desription
timeout -  max time for the test method to run after that it will fail and next method will run 
priority
dependsOnMethods - will run dependentdent method first and then original method 
enabled - done
groups - done 
*/
