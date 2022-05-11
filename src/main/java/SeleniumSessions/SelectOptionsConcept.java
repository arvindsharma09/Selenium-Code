package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectOptionsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		
		By Country = By.id("Form_submitForm_Country");
		By State = By.id("Form_submitForm_State");
		
		Select select = new Select(driver.findElement(Country));
		List<WebElement> CountryList = select.getOptions();
		System.out.println(CountryList.size());
		
		for(WebElement e :CountryList ) {
			String Text = e.getText();
			//System.out.println(Text);
				if(Text.equals("India")) {	
					e.click();
					break;
				}
		}
				
		
		
	}

	
	
}
