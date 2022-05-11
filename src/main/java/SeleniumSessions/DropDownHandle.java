package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		
		/*WebElement Country =driver.findElement(By.id("Form_submitForm_Country"));
		
		Select select= new Select(Country);
		
		select.selectByVisibleText("India");
		select.selectByValue("Australia");
		select.selectByIndex(5);*/
		
		
		By Country = By.id("Form_submitForm_Country");
		By State = By.id("Form_submitForm_State");
		
		doSelectByVisibleText(Country, "India");
		doSelectByVisibleText(State, "Punjab");
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);	
	}

	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);	
}
	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectDropDownValue(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> OptionList = select.getOptions();
		System.out.println(OptionList.size());
		
		for(WebElement e :OptionList ) {
			String Text = e.getText();
			//System.out.println(Text);
				if(Text.contentEquals("India")) {
					e.click();
					break;
	}
		}
}
}