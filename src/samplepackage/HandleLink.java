package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.google.com");
        driver.findElement(By.className("gb_P")).click();
        
	}

}
