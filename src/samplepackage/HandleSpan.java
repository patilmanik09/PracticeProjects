package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleSpan {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.google.com");
	    driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
	    driver.findElement(By.xpath(".//*[@id='gbwa']/div[2]/a[1]")).click();
	    driver.findElement(By.xpath(".//*[@id='gb53']/span[1]")).click();
	    driver.navigate().back();
	    
	}

}
