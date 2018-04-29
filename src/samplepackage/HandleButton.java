package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleButton {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
    driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).isEnabled());
    driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
    System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).isEnabled());
    System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).isDisplayed());
    
    
}
}