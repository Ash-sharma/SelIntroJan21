import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWIndow {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/SelIntro/Drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://amazon.com");
	
	
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cars");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	Thread.sleep(5000);
	
	System.out.println(driver.getWindowHandles());
	
	String firstWindowHandle = driver.getWindowHandle();
	
	Set <String> wh = driver.getWindowHandles();
	
	
	
	
	for(String e : wh) {
		if(!firstWindowHandle.equalsIgnoreCase(e)) {
			driver.switchTo().window(e);
			WebElement pl =driver.findElement(By.className("av-retail-m-nav-text-logo"));
			if(pl.isDisplayed()) {System.out.println("in new window");}
			driver.close();
		}
	}
	driver.switchTo().window(firstWindowHandle);
	WebElement p1= driver.findElement(By.className("a-size-medium"));
	System.out.println(p1.getText());
	
	driver.quit();
}
}
/* 
 * getwindowhadle
 * */
