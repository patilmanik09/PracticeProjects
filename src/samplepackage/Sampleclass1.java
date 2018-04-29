package samplepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sampleclass1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
    WebDriver driver= new FirefoxDriver();
    
    driver.get("http://www.google.com");
	driver.navigate().to("http://www.yahoo.com");
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
    
	driver.navigate().forward();
	System.out.println(driver.getCurrentUrl());
	
	driver.manage().window().maximize();
		
	driver.close();
	
	}

}
