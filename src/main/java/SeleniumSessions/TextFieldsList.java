package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFieldsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/register");

		// form//input[@type='text' or @type='email' or @type='tel' or @type='password']

		List<WebElement> textfieldList = driver.findElements(By.xpath("// form//input[@type='text' or @type='email' or @type='tel' or @type='password']"));
		
		int fieldcount = textfieldList.size();
		
		System.out.println(fieldcount);
		
		/*for(int i=0; i<textfieldList.size();i++) {
			System.out.println(textfieldList.get(i).getText());
		}*/
		
		for(WebElement e : textfieldList) {
			e.sendKeys("testing");
		}
		
	}

}
