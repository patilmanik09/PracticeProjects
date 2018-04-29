package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.carmax.com/");
		
		Actions builder  = new Actions(driver);
		WebElement menuElement = driver.findElement(By.linkText("Sell Your Car"));
		builder.moveToElement(menuElement).build().perform();
		driver.findElement(By.linkText("What You Will Need")).click();
		 
		

	}

}
