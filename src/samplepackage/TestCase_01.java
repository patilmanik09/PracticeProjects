package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase_01 {
	
	public static void main (String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpatil\\Desktop\\Selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://gcrit.com/build3/");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("create an account")).click();
    driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
    driver.findElement(By.name("firstname")).sendKeys("mani");
    driver.findElement(By.name("lastname")).sendKeys("Patil");
    driver.findElement(By.id("dob")).sendKeys("01/20/1990");
   driver.findElement(By.name("email_address")).sendKeys("mani13@yopmail.com");
   driver.findElement(By.name("street_address")).sendKeys("mumbai");
   driver.findElement(By.name("postcode")).sendKeys("12345");
   driver.findElement(By.name("city")).sendKeys("Mumbai");
   driver.findElement(By.name("state")).sendKeys("Maharashtra");
   Select dropDrop = new Select (driver.findElement(By.name("country")));
   dropDrop.selectByVisibleText("India");
   
   driver.findElement(By.name("telephone")).sendKeys("1245857478");
   driver.findElement(By.name("password")).sendKeys("123456");
   driver.findElement(By.name("confirmation")).sendKeys("123456");
   driver.findElement(By.id("tdb4")).click();
   
   String confirmationMessage = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/h1")).getText();
   
   if (confirmationMessage.equals("Your Account Has Been Created!")){
	   System.out.println("Login successfull");
   }
   else {
	   System.out.println("Login unsuccessfull");
   }
    driver.close();
    
	}
}
