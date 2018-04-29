package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Handletextarea {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://accounts.google.com");
	    String S = driver.findElement(By.xpath(".//*[@id='headingSubtext']")).getText();
        System.out.println(S);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;  
        js.executeScript("window.scrollBy(0,1000)");
        
        WebElement Element = driver.findElement(By.linkText("Linux"));
        
        js.executeScript("argument[].scrollIntoView();", Element);
        

	}

}
