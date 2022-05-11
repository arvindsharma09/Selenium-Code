package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?");
		
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		
		Thread.sleep(3000);
		
		//ul//li[@class='ac_even ac_over' or @class='ac_odd' or @class='ac_even']
		
		List<WebElement> SuggList = driver.findElements(By.xpath("//ul//li[@class='ac_even ac_over' or @class='ac_odd' or @class='ac_even']"));

		for(WebElement e :SuggList ) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.contains("Casual Dresses > Printed Dress")) {
				e.click();
				break;
			}
		}
		
	}

}
