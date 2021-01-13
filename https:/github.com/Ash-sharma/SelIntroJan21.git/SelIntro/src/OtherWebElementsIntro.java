import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherWebElementsIntro {
	
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.testandquiz.com/selenium/testing.html";
		
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/SelIntro/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		
		WebElement rbtn = driver.findElement(By.id("male"));
		WebElement lbtn = driver.findElement(By.id("female"));
		rbtn.click();
		System.out.println(rbtn.isSelected());
		System.out.println(lbtn.isSelected());
		
		WebElement checkbox = driver.findElement(By.className("Automation"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		
		Thread.sleep(2000);
		driver.close();
	}

}
