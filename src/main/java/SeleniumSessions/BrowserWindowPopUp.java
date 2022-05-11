package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> It = handles.iterator();
		String parentWindowID = It.next();
		System.out.println("Parent Window Id is : " + parentWindowID);

		String childWindoID = It.next();
		System.out.println("Child Window Id is : " + childWindoID);

		driver.switchTo().window(childWindoID);
		Thread.sleep(3000);
		String ChildWindowTitle = driver.getTitle();
		System.out.println("Child Window Title is " + ChildWindowTitle);
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		Thread.sleep(3000);
		String parentWindowTitle = driver.getTitle();
		System.out.println("Parent Window Title is " + parentWindowTitle);
		
		driver.quit();
	}

}
