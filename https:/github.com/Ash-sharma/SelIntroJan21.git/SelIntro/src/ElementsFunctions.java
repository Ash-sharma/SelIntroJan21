import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementsFunctions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/SelIntro/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		
		WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
		
		if(logo.isDisplayed()) {
		
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println(searchbar.isSelected());
		searchbar.click();
		System.out.println(searchbar.isSelected());
		searchbar.sendKeys("cars");
		searchbar.submit();
	
		List <WebElement> l1 = driver.findElements(By.className("a-size-medium"));
		System.out.println(l1.size());
		
		for (int i=0; i<l1.size(); i++) {
			System.out.println(l1.get(i).getText());
		}
		
		
		}
		else
		{System.out.println("You are not navigated to the page");}
		
		Thread.sleep(2000);
		driver.close();
	}

}
/* WebElements methods
 * clear
 * sendkeys
 * click
 * isDisplayed 
 * isSelected -  boolean 
 * forms -  submit 
 * get text()
 * getTagName()
 * getattibutes 
*/
