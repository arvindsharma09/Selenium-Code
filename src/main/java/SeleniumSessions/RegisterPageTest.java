package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPageTest {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/register");

		String title = driver.getTitle();
		System.out.println(title);

		if (title.contains("Register Account")) {
			System.out.println("Title is Correct");
		} else {
			System.out.println("Title is not Correct");
		}

		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By Email = By.id("input-email");
		By Telephone = By.id("input-telephone");

		By Password = By.id("input-password");
		By CnfPwd = By.id("input-confirm");

		// driver.findElement(FirstName).sendKeys("Arvind");
		// driver.findElement(LastName).sendKeys("Sharma");
		// driver.findElement(Email).sendKeys("arvindsharma09@gmail.com");
		// driver.findElement(Telephone).sendKeys("4694655559");
		// driver.findElement(Password).sendKeys("testing@123");
		// driver.findElement(CnfPwd).sendKeys("testing@123");

		// getElement(FirstName).sendKeys("Arvind");
		// getElement(LastName).sendKeys("Sharma");
		// getElement(Email).sendKeys("arvindsharma09@gmail.com");
		// getElement(Telephone).sendKeys("4694655559");
		// getElement(Password).sendKeys("testing@123");
		// getElement(CnfPwd).sendKeys("testing@123");

		// doSendKeys(FirstName, "Arvind");
		// doSendKeys(LastName, "Sharma");
		// doSendKeys(Email, "arvindsharma09@gmail.com");
		// doSendKeys(Telephone, "4694655559");
		// doSendKeys(Password, "testing@123");
		// doSendKeys(CnfPwd, "testing@123");

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}

	public static void doSendKeys(By Locator, String value) {
		driver.findElement(Locator).sendKeys(value);
	}

}
