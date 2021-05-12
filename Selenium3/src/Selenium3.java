import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/ejmoyer192/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("imdb");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
        driver.findElement(By.xpath("//div[@class='yuRUbf']")).click();
        driver.findElement(By.id("imdbHeader-navDrawerOpen--desktop")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Top Rated Movies")).click();
        
        List<WebElement> a = driver.findElements(By.xpath("//td[@class=\"titleColumn\"]"));
        
        for (int x = 0; x < 5; x++) {
            System.out.println(a.get(x).getText());
        }
	}
}