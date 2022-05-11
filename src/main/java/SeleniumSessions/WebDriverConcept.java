package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arvind Sharma\\Work\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		
		System.out.println(title);
		
		// Validation Point/CheckPoint
		if(title.equals("Google")) {
			System.out.println("Title is Correct");
		}
		else {
			System.out.println("Tile is InCorrect");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}

}
