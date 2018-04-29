package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureErrormessage {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://login.yahoo.com");
	    driver.findElement(By.name("signin")).click();
	    String ErrorMessage = driver.findElement(By.xpath(".//*[@id='username-error']")).getText();
	    System.out.println(ErrorMessage);

	}

}
