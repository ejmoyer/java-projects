import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ExerciseThree {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/ejmoyer192/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.id("email")).sendKeys("testemail@email.com");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(4000);
		
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		actions.moveToElement(menuOption).perform();
		
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")).click();
		
		WebElement dropdown = driver.findElement(By.id("selectProductSort"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		
		dropdown = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div"));
		actions.moveToElement(dropdown).perform();
		
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li[3]/div/div[2]/div[2]/a[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
		// start of new code

		menuOption = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
		actions.moveToElement(menuOption).perform();
		
		menuOption = driver.findElement(By.xpath("//*[@id=\"button_order_cart\"]/span"));
		actions.moveToElement(menuOption).perform();
		driver.findElement(By.xpath("//*[@id=\"button_order_cart\"]/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_7_34_0_451978\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("cheque")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"order-list\"]/tbody/tr/td[1]/a")).click();
		Thread.sleep(2000);
		
		// remove comment lines here to download invoice 
		//driver.findElement(By.xpath("//*[@id=\"block-order-detail\"]/div[2]/p[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
	}

}
