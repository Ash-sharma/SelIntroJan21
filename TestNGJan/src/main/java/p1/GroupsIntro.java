package p1;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsIntro {

	@Test (groups = {"group1"})
	public void a() {
		System.out.println("ok");
	} 
	@Test (groups = {"group2"})
	public void b() {
		System.out.println("ok2");
	} 
	@Test (groups = {"group3", "group1"})
	public void c() {
		System.out.println("ok3");
	} 
	@Test
	public void d() {
		System.out.println("ok");
	} 
	@Test
	public void e() {
		System.out.println("ok");
	} 
	@BeforeGroups("group2")
	public void m27()
	{System.out.println("before group2 executed");}
	
	@AfterGroups("group2")
	public void m28()
	{System.out.println("before group2 executed");}
	
}
