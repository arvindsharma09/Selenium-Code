package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	
	public WebDriver driver;
	
	/**
	 * This method is used to initialize the driver on the basis of given browser
	 * @param BrowserName
	 * @return
	 */
	public WebDriver launchBrowser(String BrowserName) {
		System.out.println("Browser Name is : "+ BrowserName);
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arvind Sharma\\Work\\chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();	
		}
		
		else if (BrowserName.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arvind Sharma\\Work\\geckodriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else {
			System.out.println("Please Pass the correct Browser" + BrowserName);
		}
		
		return driver;
		
	}
	
	public void launchUrl(String url) {
		 driver.get(url);
		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
	
}
