package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_customer {
	public static void main(String[] args) {
		int i;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpatil\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	          
	    for (i=1; i<=3; i++) {
	    driver.get("http://www.gcrit.com/build3/admin");
		driver.manage().window().maximize();
	    driver.findElement(By.name("username")).sendKeys("admina");
	    driver.findElement(By.name("password")).sendKeys("admin@123");
	    driver.findElement(By.id("tdb1")).click();
	    }
	    String text = driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td")).getText();
	  
	    if (text.contains("The maximum number of login attempts has been reached. Please try again in 5 minutes.")) {
	    	System.out.println("Time out error - passed");
	    }
	    else {	
	    	System.out.println("Timeout error - failed");
	    }
	    
	    	
}
}
