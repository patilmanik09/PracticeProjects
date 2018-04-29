package windowHandle;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles2 {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    
	    driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
	    String parent = driver.getWindowHandle();
	    
	    System.out.println("parent id is "+parent);
	    	
	    driver.findElement(By.xpath("//*[@id=\"post-body-6170641642826198246\"]/a[1]")).click();
	    
	    driver.switchTo().window(parent);
	    
	    driver.findElement(By.xpath("//*[@id=\"post-body-6170641642826198246\"]/a[2]")).click();
	    
	    driver.switchTo().window(parent);
	    driver.findElement(By.xpath("//*[@id=\"post-body-6170641642826198246\"]/a[3]")).click();
	    
	    Set<String> allwindows  = driver.getWindowHandles();
	     
	    ArrayList<String> tabs = new ArrayList<>(allwindows);
	    
	    driver.switchTo().window(tabs.get(1));
	    //driver.close();
	    Thread.sleep(5000);
	    driver.switchTo().window(tabs.get(2));
	    //driver.close();
	    Thread.sleep(5000);
	    driver.switchTo().window(tabs.get(3));
	    Thread.sleep(5000);
	    
	    
	    
	    
	    

	}

}
