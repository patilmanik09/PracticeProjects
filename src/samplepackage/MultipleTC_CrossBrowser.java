package samplepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleTC_CrossBrowser {
	public static WebDriver driver;
	public static int Browser;
	

	public static void main(String[] args) {
		
		for (Browser=1; Browser<=2; Browser++) {
			
			if (Browser==1) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if (Browser==2) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpatil\\Desktop\\Selenium\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			driver.get("https://www.google.co.in/");	
	        String PageTitle = driver.getTitle();
	        if (PageTitle.equals("Google")){
	        	System.out.println("Pass");
	        }
	        else {
	        	
	        	System.out.println("Fail");
	        
	        }
	        
	        driver.close();
			
		}
		    
    }

}
