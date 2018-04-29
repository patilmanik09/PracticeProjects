package TestNGTestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_01 {
	
	WebDriver driver;
	@Test
	public void launchbrowser() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
	driver = new FirefoxDriver();

	}
	@Test	
	public void login() {
	driver.get("https://www.google.co.in/");
	System.out.println("login successfull" );
	}
	
	@Test (dependsOnMethods = {"login"})
	public void TestABCD() {	
	System.out.println("TestABCD");
	}
	
	@Test (dependsOnMethods = {"TestABCD"})
	public void TestXYZ() {	
	System.out.println("TestXYZ");
	}
	
	@Test (dependsOnMethods = {"TestXYZ"})
	public void TestPQR() {	
	Assert.assertEquals("gmail", "xyz");
	}
	
	@Test (dependsOnMethods = {"TestPQR"}, alwaysRun = true)
	public void logout() {
	System.out.println("Logout succesfull");
	}


}
