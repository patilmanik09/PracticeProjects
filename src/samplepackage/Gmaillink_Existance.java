package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gmaillink_Existance {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpatil\\Desktop\\Selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.google.com");
    
    
    try 
    {
    	
    if (driver.findElement(By.linkText("yahoo")).isDisplayed()) {
    	System.out.println("exists");
    }
    }
    catch (NoSuchElementException e)
    
    {
    	System.out.println("Does not exists");
    	driver.close();
    }
	}

}
