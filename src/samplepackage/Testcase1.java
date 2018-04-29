package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpatil\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create account")).click();
		String url = driver.getCurrentUrl();
	if (url.contains("wikipedia.org")){
			System.out.println("Internal Link");
		}
	else {
		
		System.out.println("External link");
	}
	
	driver.navigate().back();
	driver.findElement(By.linkText("www.seleniumhq.org")).click();
	url = driver.getCurrentUrl();
	
	if (!url.contains("wikipedia.org")) {
		System.out.println("External link");
	}
	else {
		System.out.println("Internal link");
	}
		driver.close();

	}

}
