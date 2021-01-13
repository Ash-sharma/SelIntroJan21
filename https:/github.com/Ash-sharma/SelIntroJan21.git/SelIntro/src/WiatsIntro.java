import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WiatsIntro {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/SelIntro/Drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://amazon.com");
	
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
	System.out.println(logo.isDisplayed());
	
//	explicit wait
	//WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement searchbar = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
	searchbar.sendKeys("cars");
	
	// fluent or polling wait 
	//fluent wait
	
	driver.close();
}
}
/* Waits provided by selenium 
 * Implict wait - web driver waits for a ceratins time vefore itgives you exception
 * Explicit wait - always used with certain condition, tells the driver to wait till this conditions is met 
 *                 you can provide the maximum amount that it should wait for this condidtion to be true
 * Fluent WAIT  -  where you decice your maximum timout and pooling with execptions to ingore 
 * 
 *Implict wait								Explicit wait
 *wait is applied to all the elements       applied to only those elements which intended 
 *of script
 *No condition is expected 					have to provide expected condition 
 * used when certain time is associated      Generally preffered 
 * with the script 		
 * */
 