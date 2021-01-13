import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	
	public static void main(String[] args) throws InterruptedException {
String url = "https://www.testandquiz.com/selenium/testing.html";
		
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/SelIntro/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		
		WebElement gabx = driver.findElement(By.xpath("//*[text() = 'Generate Alert Box']"));
		gabx.click();
		
		Alert a = driver.switchTo().alert();
		
		a.accept();
		
		WebElement cbox = driver.findElement(By.xpath("//*[text() = 'Generate Confirm Box']"));
		cbox.click();
		Thread.sleep(1000);
		
		Alert b = driver.switchTo().alert();
		b.dismiss();
		
		System.out.println(driver.findElement(By.id("demo")).getText());
		
		Thread.sleep(2000);
		driver.close();
	}

}
