package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert= driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();// click on ok button
		alert.dismiss();// click on cancel button*/
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//ul/li[1]/button")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
           System.out.println(text);
           
           alert.accept();
           
           driver.switchTo().defaultContent();
           
           Thread.sleep(4000);
           
         //p[@id='result']
           
           WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
           String Resulttext= result.getText();
           System.out.println(Resulttext);
           
           if(Resulttext.matches("You successfully clicked an alert")) {
        	   System.out.println("Expected Result");
           }
           else {
        	   System.out.println("Not Expected Result");
           }
}
}

