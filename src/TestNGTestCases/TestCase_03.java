package TestNGTestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_03 {

	WebDriver driver;
	
	@BeforeClass
	public void launchbrowser() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
	driver = new FirefoxDriver();
	}
	
	@Test
	public void verifytitle() {
	driver.get("https://www.google.co.in/");
	Assert.assertEquals("Google", driver.getTitle());
	}
		
    @Test
    
    public void yahooTitle() {
    driver.get("https://in.yahoo.com/");
    Assert.assertEquals("Yahoo", driver.getTitle());
    }
    
    @AfterClass
    public void closebrowser() {
    driver.close();
    }
    }

