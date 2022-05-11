package TestNgSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	@BeforeSuite
	public void connectwithDB() {
		System.out.println("BS -- Connect with DB");
	}

	@BeforeTest
	public void createuser() {
		System.out.println("BT -- Create User");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch Browser");
	}

	@BeforeMethod
	public void login() {
		System.out.println("BM-- login");
	}

	@Test
	public void titleTest() {
		System.out.println("Page Title test");
	}
	
	@Test
	public void headerTest() {
		System.out.println("Page Header Test");
	}
	
	@Test
	public void isUserLoggedInTest() {
		System.out.println("User is Logged in");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM -- Logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- Close browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- Delete User");
	}
	
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- Disconnect with DB");
	}
	
	
}
