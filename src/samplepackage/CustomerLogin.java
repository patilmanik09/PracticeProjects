package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomerLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.gcrit.com/build3/admin");
	    driver.findElement(By.name("username")).sendKeys("admina");
	    driver.findElement(By.name("password")).sendKeys("admin@123");
	    driver.findElement(By.id("tdb1")).click();
	    
	    String url = driver.getCurrentUrl();
	    if (url.equals("http://www.gcrit.com/build3/admin/index.php"));{
	    	driver.findElement(By.linkText("Online Catalog")).click();
	    	System.out.println("Passed");
	    }
	    
	    	
}	    
}
