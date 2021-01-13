import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorIntro {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/SelIntro/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://amazon.com");
		
		WebElement searchfield = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		 searchfield.sendKeys("cars");
		 
		 
		
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		
	    driver.navigate().back();
	    WebElement basicProducts = driver.findElement(By.cssSelector("h2.a-color-base"));
	    System.out.println(basicProducts.getText());
		
	    // tag and attirbute 
	    driver.findElement(By.cssSelector("a[class= a-link-normal]")).click();
	    
	   driver.navigate().back();
	   
	    // sub string match ^
	    driver.findElement(By.cssSelector("a[id^= 'icp']")).click();
	    driver.navigate().back();
	    
	    // sub string match $
	    driver.findElement(By.cssSelector("a[id$= 'yout']")).click();
	    driver.navigate().back();
	    
	    // sub string match *
	    driver.findElement(By.cssSelector("a[id*= 'p-nav-f']")).click();
	    
	    Thread.sleep(2000);
	    
		driver.close();
	}
}
/*Css loactors  -  tag id
 * 1. tag and ID (tag#id)
 * 2. tag  and Class (tag.classname)
 * 3. tag class and attribute ("tagname[Attribute= value]")
 * 4. sub string matches: 
 *  ^ = starts ["tag[Attribute^ = 'asn']"]
 *  $ = ends with ["tag[Attribute$ = 'asn']"]
 *  *= contains ["tag[Attribute* = 'asn']"]
 * */
 