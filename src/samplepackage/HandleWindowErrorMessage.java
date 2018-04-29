package samplepackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowErrorMessage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.findElement(By.name("proceed")).click();
        Alert alert = driver.switchTo().alert();
        String Error_Message = alert.getText();
        System.out.println(Error_Message);
       alert.dismiss();
       
       driver.findElement(By.id("login1")).sendKeys("India123");
       driver.close();
	}

}
