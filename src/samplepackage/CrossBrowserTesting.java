package samplepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpatil\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");	
        String PageTitle = driver.getTitle();
        if (PageTitle.equals("Google")){
        	System.out.println("PageTitle - Pass");
        }
        else {
        	
        	System.out.println("PageTitle - Fail");
        
        }
        driver.close();
        }
	} 


