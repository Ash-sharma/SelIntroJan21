import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationIntro {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/SelIntro/Drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://amazon.com");
	 // by ID
	WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
	WebElement accountGreeting = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	System.out.println(accountGreeting.getText());
	
	//By Class
//	WebElement selectlanguage = driver.findElement(By.className("icp-nav-flag"));
//	selectlanguage.click();
	
	//By Name
//	WebElement searchBar = driver.findElement(By.name("field-keywords"));
//	searchBar.sendKeys("cars"); 
	
	// By linktext
	WebElement todaysDeals = driver.findElement(By.linkText("Today's Deals"));
	todaysDeals.click();
	
	//by partialtext
	driver.findElement(By.partialLinkText("Customer")).click(); // chaining 
	
	
	// hard waiting - it will stop execution of the script for given time 
	Thread.sleep(2000);
	
	driver.close();
}
}
/*Locator : 8 different locators (VVIP)
 *1.  id - most preferred  -  used highly 
 *2. class - can be duplicate but prefered if it is unique  - use highly  
 *3. name - 
 *4. tagname: - not used as much 
 *5. lintext: 
 *6. partial link text - 
 *7. css  - highly used 
 *8. xpath - highly used 
 * 
 * */
