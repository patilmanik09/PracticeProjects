package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageHandling {
																																	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.google.com");
        System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());
        System.out.println(driver.findElement(By.xpath(".//*[@id='hplogo']")).getAttribute("style"));
        
        driver.navigate().to("http://newtours.demoaut.com/");
        driver.findElement(By.name("login")).click();
        
        driver.navigate().to("http://www.seleniumhq.org/");
        driver.findElement(By.xpath(".//*[@id='choice']/tbody/tr/td[2]/center/a/img")).click();
        
	}

}
