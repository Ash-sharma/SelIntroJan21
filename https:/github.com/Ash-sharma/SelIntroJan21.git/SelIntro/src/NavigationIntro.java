import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationIntro {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/SelIntro/Drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://amazon.com");
	
	// By linktext
		WebElement todaysDeals = driver.findElement(By.linkText("Today's Deals"));
		todaysDeals.click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
	
	
	driver.close();
	}
}
/* navigate methods:
 *  forward 
 *  backward 
 *  referesh 
 * 
 * */
