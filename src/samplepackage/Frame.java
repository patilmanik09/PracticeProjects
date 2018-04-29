package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    //driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	    //driver.switchTo().frame("2");
	    //driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
	    
	    //or 
	    
	    driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	    driver.switchTo().frame("classFrame");
	    driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
	    Thread.sleep(3000);
	    

	}

}
