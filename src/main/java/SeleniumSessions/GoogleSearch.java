package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Naveen Automationlabs");
		
		Thread.sleep(3000);
		
		//ul[@role='listbox']/li//div[@class='wM6W7d']//span
		
		List<WebElement> SuggList = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span"));
		
		for(WebElement e :SuggList ) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.contains("resume")) {
				e.click();
				break;
			}
			
		}
		
		
	}

}
