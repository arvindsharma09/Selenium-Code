package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		List<WebElement> totallLinks = driver.findElements(By.tagName("a"));
		System.out.println(totallLinks.size());
		
		for(int i=0;i<totallLinks.size();i++) {
			System.out.println(totallLinks.get(i).getText());		
		}
		
		List<WebElement> totalimages = driver.findElements(By.tagName("img"));
			System.out.println("Total Images are : "+ totalimages.size());
		
			for(int k=0;k<totalimages.size();k++) {
				System.out.println(totalimages.get(k).getText());
			}
			
			
			
	}

}
