package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("Chrome");
		brUtil.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		//driver.findElement(By.linkText("Register")).click();
		
		By RegLink = By.linkText("Register");
		ElementUtil eleUtil1 = new ElementUtil(driver);
		eleUtil1.doClick(RegLink);
		

		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By Email = By.id("input-email");
		By Telephone = By.id("input-telephone");
		By Password = By.id("input-password");
		By CnfPwd = By.id("input-confirm");
		By chkbox= By.xpath("//input[@name='agree']");
		By submit = By.xpath("//input[@type='submit']");
		

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(FirstName, "Arvind");
		eleUtil.doSendKeys(LastName, "Sharma");
		eleUtil.doSendKeys(Email, "arvindsharma690@gmail.com");
		eleUtil.doSendKeys(Telephone, "4694655559");
		eleUtil.doSendKeys(Password, "testing@123");
		eleUtil.doSendKeys(CnfPwd, "testing@123");
		eleUtil.doClick(chkbox);
		eleUtil.doClick(submit);
		
		By heading = By.xpath("//*[@id='content']/p[1]");
		
		/*String headtext = driver.findElement(heading).getText();
		System.out.println(headtext);
		
		if(headtext.equals("Congratulations! Your new account has been successfully created!")) {
			System.out.println("User is created Successfully");
		}
		else {
			System.out.println("User is not Created successfully ");
		}*/
		
		eleUtil.doElementGetText(heading);
		System.out.println(heading);
		
			if(heading.equals("Congratulations! Your new account has been successfully created!")) {
				System.out.println("User is Created Successfully");
			}
		
			else {
				System.out.println("User is not Created Successfully");
			}
		
		
		//brUtil.quitBrowser();
	}

}
