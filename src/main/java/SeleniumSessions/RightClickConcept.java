package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()= 'right click me']"));
	
		Actions action = new Actions(driver);
		action.contextClick(rightclick).perform();
		
		List<WebElement> itemsList = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li/span"));
		System.out.println(itemsList.size());
		
		for(WebElement e:itemsList ) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.contains("Delete")) {
				e.click();
				break;
			}
		}
		
		
		
		

	}

}
