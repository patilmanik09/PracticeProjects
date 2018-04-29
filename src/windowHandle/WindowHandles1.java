package windowHandle;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    
	    driver.get("www.naukri.com");
	    String parent = driver.getWindowHandle();
	    
	    System.out.println("parent id is "+parent);
	    
	    Set<String> allwindows  = driver.getWindowHandles();
	    
	    int count  = allwindows.size();
	    
	    System.out.println("count is "+count);
	    
	    for (String child: allwindows) {
	    	
	    	if (!parent.equalsIgnoreCase(child));
	    	
	    	driver.switchTo().window(child);
	    	
	    	String title = driver.getTitle(); 	
	   
	        System.out.println("Title is "+title);
	    }
	    
	   

	}

}
