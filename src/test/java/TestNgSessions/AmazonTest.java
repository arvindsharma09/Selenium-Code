package TestNgSessions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	WebDriver driver;
	
	@BeforeTest
	public void SetUp() {
		WebDriverManager.chromedriver().setup();
		
	}
	
	
	
	

}
