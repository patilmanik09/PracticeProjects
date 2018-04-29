package samplepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_TestCase_1 {

	@Test
	public void verifyTitle() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.gmail.com");
	    String pageTitle = driver.getTitle();
	    Assert.assertEquals(pageTitle, "Gmail");

	}

}
