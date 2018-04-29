package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckCommunication_BetweenBrowsers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpatil\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		String text = driver.findElement(By.xpath(".//*[@id='headingText']")).getText();
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver FirefoxDriver = new FirefoxDriver();
		FirefoxDriver.get("http://gcrit.com/build3/");
		//FirefoxDriver.manage().window().maximize();
		FirefoxDriver.findElement(By.linkText("create an account")).click();
		FirefoxDriver.findElement(By.name("firstname")).sendKeys(text);
		

	}

}
