import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassIntro {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.testandquiz.com/selenium/testing.html";
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/SelIntro/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement db = driver.findElement(By.id("dblClkBtn"));
		
//		act.contextClick(db).perform();
		
		act.doubleClick(db).perform();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		
		WebElement image =  driver.findElement(By.id("sourceImage"));
		WebElement dloc = driver.findElement(By.id("targetDiv"));
		
		act.dragAndDrop(image, dloc).perform();
		
		Thread.sleep(2000);
		driver.close();
	}/* Action class provides you with the ablity to perform mouse action 
	  left clik, right drag drop etc 
	  mouse actions
	  keyboard actions
	*/

}
