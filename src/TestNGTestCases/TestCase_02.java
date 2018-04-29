package TestNGTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestCase_02 {
public WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
	driver = new FirefoxDriver();
	
	}
	
	@Test
	public void VerifyTitle() {
	driver.get("https://www.google.co.in/");
    String PageTitle = driver.getTitle();
	Assert.assertEquals("Google",PageTitle);
   	}
	
	@Test
	public void VerifyTitle2() {
	driver.get("https://www.in.yahoo.com/");
	Assert.assertEquals("Yahoo",driver.getTitle());
	}

	@AfterMethod
	public void closeBrowser() {
	driver.close();
	}

}

