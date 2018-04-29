package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Admin_login_Using_UserDefunedMethod {
	
	public static WebDriver driver;  
	
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
		
	public void adminlogin() {
		
		driver.get("http://www.gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
        driver.findElement(By.id("tdb1")).click();
        //driver.close();
        	
	}
	
public void adminlogin(String username, String password) {
	    
		driver.get("http://www.gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("tdb1")).click();
        //driver.close();
        	
	}
		
	public static void main(String[] args) {
	
		Admin_login_Using_UserDefunedMethod obj = new Admin_login_Using_UserDefunedMethod();
		obj.launchBrowser();
		obj.adminlogin();
		obj.launchBrowser();
		obj.adminlogin("admin", "admin@123");
		

		
	}
}
