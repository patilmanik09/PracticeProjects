package samplepackage;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC_Test_Case {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpatil\\Desktop\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	    driver.manage().window().maximize();	
	    driver.findElement(By.id("usernameId")).sendKeys("gcreddy7");
	    driver.findElement(By.name("j_password")).sendKeys("gld938");
	    Scanner scan = new Scanner (System.in);
	    System.out.println("Enter Captcha");
	    String captcha = scan.nextLine();
	    driver.findElement(By.name("j_captcha")).sendKeys(captcha);
	    driver.findElement(By.id("loginbutton")).click();
	    String url = driver.getCurrentUrl();
	    
	    if (url.equals("https://www.irctc.co.in/eticketing/eticketing/home")) {
	    	System.out.println("Login successfull");
	    }
	    else 
	    {
	    	System.out.println("Login Failed");
	  
	    }

	}

}