package samplepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlebrowser {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
    driver.get("https://www.google.co.in");
    String PageTitle = driver.getTitle();
    System.out.println(PageTitle);
    
    String URL = driver.getCurrentUrl();
    System.out.println(URL);
    
    String WindowHandle = driver.getWindowHandle();
    System.out.println(WindowHandle);
    
    //driver.close();
	}

}
