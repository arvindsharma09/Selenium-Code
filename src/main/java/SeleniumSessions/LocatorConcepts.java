package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcepts {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// id -- 1st Approach
		// driver.findElement(By.id("input-email")).sendKeys("arvindsharma09@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("testing@123");

		// 2nd Approach
		// WebElement email = driver.findElement(By.id("input-email"));
		// WebElement password = driver.findElement(By.id("input-password"));

		// email.sendKeys("arvindsharma09@gmail.com");
		// password.sendKeys("testing@123");

		// 3rd Approach - By Locator Approach

		// By email = By.id("input-email");
		// By Password = By.id("input-password");

		// driver.findElement(email).sendKeys("arvindsharma09@gmail.com");
		// driver.findElement(Password).sendKeys("testing@123");

		// 4th Approach- Generic function

		//By email = By.id("input-email");
		//By Password = By.id("input-password");

		//getElement(email).sendKeys("arvindsharma09@gmail.com");
		//getElement(Password).sendKeys("testing@123");
		
		// 5th Approach -- generic function + Actions
		
		//By email = By.id("input-email");
		//By Password = By.id("input-password");
		
		//doSendKeys(email, "arvindsharma09@gmail.com");
		//doSendKeys(Password, "testing@123");
		
		// 6th Approach
		
		By email = By.id("input-email");
		By Password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(email, "arvindsharma09@gmail.com");
		eleUtil.doSendKeys(Password, "testing@123");
		
		
		
	}

	
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void doSendKeys(By Locator, String value) {
		driver.findElement(Locator).sendKeys(value);
	}
	
	
	
	
	
}
