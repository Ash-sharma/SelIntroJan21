import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIntro {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/SelIntro/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://amazon.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div[1]")).click();
		
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		searchbar.sendKeys("cars");
		
		
		WebElement searchbtn = driver.findElement(By.xpath("//*[contains(@id,'search-submit-')]"));
		searchbtn.click();
		
		WebElement searchResutof = driver.findElement(By.xpath("//*[starts-with(@class, 'a-color')]"));
		System.out.println(searchResutof.getText());
		
		WebElement product = driver.findElement(By.xpath("//*[text()='Cars 3 (Theatrical)']"));
		product.click();
		
		driver.navigate().back();
		
		WebElement pname = driver.findElement(By.xpath("(//span[@class='a-size-base'])[last()]"));
		System.out.println(pname.getText());
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
/* Xpath -  it is used top locate nodes in DOM 
 * 1.Absolute xpath or full x path  - /
 * 2. Relative xpath  - //
 * 3. Xpath using sinlge attribute //*[@attributeNmae = "value"]
 * 4. mulitple attributes also : //input[@id= "nav-search-submit-button"] [@class= "nav-input nav-progressive-attribute"]
 *  5. and //tagname[@att="value" and @att="value"]
 *  6. or //tagname[@att="value" or @att="value"]
 *  7. starts_with //*[starts-with(@attribute,'value')]
 *  8. Text() - //*[text()="textvalue"]
 *  9. Using last() : to select last element which is found by xpath in dom
 *  10. Contains - //*[contains(@attribute,'value')]
 * */
