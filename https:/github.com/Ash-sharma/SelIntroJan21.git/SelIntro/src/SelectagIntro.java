import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectagIntro {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/SelIntro/Drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://amazon.com");
	
	WebElement AllDorpdpwn = driver.findElement(By.id("searchDropdownBox"));
	Select adropmenu = new Select(AllDorpdpwn);
	
	adropmenu.selectByIndex(15);
	Thread.sleep(2000);
	adropmenu.selectByValue("search-alias=videogames-intl-ship");
	Thread.sleep(2000);
	adropmenu.selectByVisibleText("Luggage");
	
	
	Thread.sleep(2000);
	driver.close();
	}
}
/*handle dropdown menus of select tag 
 * 1. select by index
 * 2. select by value
 * 3. select by visible text
 * */
