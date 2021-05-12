import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExerciseOne {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/ejmoyer192/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("testemail@email.com");
		driver.findElement(By.id("email_create")).sendKeys(Keys.RETURN);
		
		Thread.sleep(4000);
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("John");
		driver.findElement(By.id("customer_lastname")).sendKeys("Smith");
		driver.findElement(By.id("passwd")).sendKeys("password");
		
		WebElement dropdown = driver.findElement(By.id("days"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		dropdown = driver.findElement(By.id("months"));
		select = new Select(dropdown);
		select.selectByIndex(4);
		dropdown = driver.findElement(By.id("years"));
		select = new Select(dropdown);
		select.selectByValue("1990");
		
		driver.findElement(By.id("address1")).sendKeys("99 Manny Lane");
		driver.findElement(By.id("city")).sendKeys("Cityname");
		
		dropdown = driver.findElement(By.id("id_state"));
		select = new Select(dropdown);
		select.selectByIndex(5);
		
		driver.findElement(By.id("postcode")).sendKeys("18543");
		driver.findElement(By.id("phone_mobile")).sendKeys("000-321-3009");
		
		driver.findElement(By.id("submitAccount")).click();
	}

}
