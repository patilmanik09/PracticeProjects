package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Editbox {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
    WebDriver driver= new FirefoxDriver();
    driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    
    WebElement Email = driver.findElement(By.id("identifierId"));
    Email.sendKeys("manikr.patil");
    //Email.clear();
    String text = Email.getText();
    System.out.println(text);
    
    System.out.println(Email.isDisplayed());
    
    System.out.println(Email.isEnabled());
    
    Email.clear();
    
    //Thread.sleep(10000);
    //driver.close();
}
}