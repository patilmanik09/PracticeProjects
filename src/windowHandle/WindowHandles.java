package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    
	    driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
	    String parent = driver.getWindowHandle();
	    
	    System.out.println("parent window handle is "+parent);
	    
	    driver.findElement(By.xpath(".//*[@id='post-body-6170641642826198246']/a[1]")).click();
	    
	    Set<String> allwindows  = driver.getWindowHandles();	
	    
	    int count = allwindows.size();
	    
	    System.out.println("All windows count is "+count);
	    
	    for (String child: allwindows) {
	    	
	    	if(!parent.equalsIgnoreCase(child)) {
	    		
	    		driver.switchTo().window(child);
	    		
	    		Thread.sleep(5000);
	    		
	    		driver.findElement(By.name("q")).sendKeys("search");
	    		
	    		Thread.sleep(5000);
	    	
	    	    driver.close();	
	    	}
	    }
	    
	    driver.switchTo().window(parent);
	

	}

}
