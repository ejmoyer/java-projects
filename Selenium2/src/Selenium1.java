import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/ejmoyer192/Downloads/chromedriver");
		driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
	}

}
