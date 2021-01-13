import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/SelIntro/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cars");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(10000);
		
		System.out.println(driver.getWindowHandles());
		
		String firstWindowHandle = driver.getWindowHandle();
		
		Set <String> wh = driver.getWindowHandles();
		
		// convert to arraylist
		
		ArrayList<String> a = new ArrayList<String>(wh);
		
		driver.switchTo().window(a.get(1));
		WebElement pl =driver.findElement(By.className("av-retail-m-nav-text-logo"));
		if(pl.isDisplayed()) {System.out.println("in new window");}
		
		driver.switchTo().window(a.get(2));
		WebElement t2 =  driver.findElement(By.className("av-retail-m-nav-text-logo"));
		System.out.println(t2.getText());
		
		driver.switchTo().window(a.get(0));
		WebElement p1= driver.findElement(By.className("a-size-medium"));
		System.out.println(p1.getText());
		
		
		
		
		
		driver.quit();
	}
	
}

/*
 * driver. switchto(). frame(index);
 * driver. switchto(). frame(id / name);
 * driver. switchto(). frame(WebElement);
 * */
