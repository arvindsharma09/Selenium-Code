package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		ElementUtil eleUtil = new ElementUtil(driver);

		By emailId = By.id("input-email");
		
		//boolean flag = driver.findElement(email).isDisplayed();
		//System.out.println(flag);
		
		if (eleUtil.doIsDisplayed(emailId)){
			eleUtil.doSendKeys(emailId, "testing@123");
		}
		
		
		
		
			
		}
		
		
	}


