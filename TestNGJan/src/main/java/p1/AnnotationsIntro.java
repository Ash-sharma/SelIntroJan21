package p1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsIntro {
	
	@BeforeSuite
	public void m11() {
		System.out.println("I will run before your suite");
	}
	
	@AfterSuite
	public void m22() {
		System.out.println("I will run after your suite");
	}
	
	@BeforeTest
	public void m21() {
		System.out.println("I will run before your test");
	}
	
	@AfterTest
	public void m20() {
		System.out.println("I will run after your test");
	}
	@BeforeClass
	public void m23() {
		System.out.println("I run before your class");
	}
	@AfterClass
	public void m24() {
		System.out.println("I run after your class");
	}
	@Test (groups = {"group1"})
	public void a() {
		System.out.println("methoda a in annotation class");
	}
	@Test(groups = {"group2"})
	public void b() {
		System.out.println("methoda b in annotation class");
	}
	
	@BeforeMethod
	public void m25() {
		System.out.println("I run before each method");
	}
	
	@AfterMethod
	public void m26()
	{
		System.out.println("I run after each method");
	}
	@BeforeGroups (groups = {"group1"})
	public void m27()
	{System.out.println("before group executed");}
	
	@AfterGroups (groups = {"group1"})
	public void m28()
	{System.out.println("after group executed");}
} 
/*@test - used to let java know that it is testing method
 * @BeforeSuite - Executed first 
 * @AfterSuite
 * @BeforeTest
 * @AfterTest
 * @BeforeClass
 * @AfterClass
 * @BeforeMethod
 * @AfterMethod
 * @BeforeGroup
 * @AfterGroup
 * 
 */