package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");

		List<WebElement> footerLinks = driver.findElements(By.xpath("//ul[@class='footer-nav']//a"));
		
		System.out.println(footerLinks.size());
		
		for(WebElement e : footerLinks) {
			String footerlist = e.getText();
			System.out.println(footerlist);
		}
		
	}

}
