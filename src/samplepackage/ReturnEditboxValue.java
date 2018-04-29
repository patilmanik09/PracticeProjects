package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReturnEditboxValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://accounts.google.com");
        driver.findElement(By.id("identifierId")).sendKeys("manikr.patil");
        System.out.println(driver.findElement(By.id("identifierId")).getAttribute("value"));
        
	}	

}
