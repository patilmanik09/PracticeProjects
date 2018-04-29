package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sampleclass {

public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();

driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
driver.findElement(By.id("identifierId")).sendKeys("manikr.patil");
/*String Title = driver.getTitle();*/
/*String pagesource = driver.getPageSource();*/
String URL = driver.getCurrentUrl();
driver.navigate().to("https://www.yahoo.com");
String URL1 = driver.getCurrentUrl();
System.out.println(URL1);
driver.navigate().back();
String URL2 = driver.getCurrentUrl();
System.out.println(URL2);
/*WebElement email = driver.findElement(By.id("identifierId"));
email.sendKeys("manikr.patil");
email.clear();*/
/*driver.findElement(By.name("identifier")).sendKeys("manikr.patil");*/
//driver.close();

}
}
