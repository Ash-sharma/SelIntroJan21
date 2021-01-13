import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/SelIntro/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		 
		// by tagname
		
	WebElement inputField = driver.findElement(By.tagName("input"));
	inputField.sendKeys("cars");
		
		
	}
}
