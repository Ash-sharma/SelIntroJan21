package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertsIntro {
	
	@Test 
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/git/selIntro/TestNGJan/Drivers/chromedriver");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 String url = "https://amazon.com";
		 
		 driver.get(url);
		 
		 WebElement dtext = driver.findElement(By.id("glow-ingress-line1"));
		 System.out.println(dtext.getText());
		 Assert.assertEquals(dtext.getText(), "Deliver to");
		 Assert.assertTrue(dtext.isEnabled());
		 Assert.assertNotEquals(dtext.getText(), "d to");
	
		 driver.close();
	}
	
	@Test
	public void checksoftAssert() {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/git/selIntro/TestNGJan/Drivers/chromedriver");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 String url = "https://amazon.com";
		 
		 driver.get(url);
		 
		 SoftAssert sa = new SoftAssert();
		 WebElement dtext = driver.findElement(By.id("glow-ingress-line1"));
		 System.out.println(dtext.getText());
		 sa.assertEquals(dtext.getText(), "Deliver");
		 sa.assertNotEquals(dtext.getText(), "Deliver to");
		 sa.assertTrue(dtext.isEnabled());
		 
		 driver.close();
		 sa.assertAll();
		 }

	@Parameters ({"a"})
	@Test
	public void checksoftAssert(String a) {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/git/selIntro/TestNGJan/Drivers/chromedriver");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 String url = "https://amazon.com";
		 
		 driver.get(url);
		 
		 SoftAssert sa = new SoftAssert();
		 WebElement dtext = driver.findElement(By.id("glow-ingress-line1"));
		 System.out.println(dtext.getText());
		 sa.assertEquals(dtext.getText(), a);
	}
	
}/*
Asserts: expected condition , we compare the actual condition with it
if it matches then you get true - test passes
if it doesn't your  test fails 
Assert.Methods(actual, expected ) 
 Types of assertions  -
 1. Hard assdertion - your programs stops after any assertion fails 
 2. Soft Assertion - your programs runs the whole test even if any assertion fails
                     It collects all the failed assertions and then display at once 
*/
