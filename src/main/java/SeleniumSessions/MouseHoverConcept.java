package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(4000);
		WebElement Contentele = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div[1]"));
		
		Actions action= new Actions(driver);
		
		action.moveToElement(Contentele).perform();
		
		
		driver.findElement(By.linkText("Visa Services")).click();
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
		
	}

	public static void SelectSubMenu(By parentmenu, By childmenu) throws InterruptedException {
		Actions act= new Actions(driver);
		act.moveToElement(getElement(parentmenu)).perform();
		Thread.sleep(3000);
		getElement(childmenu).click();
	}
	
	
}
