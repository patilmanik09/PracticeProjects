package ScrollingInSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ScrollingInSelenium {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    
	    driver.get("http://demo.guru99.com/test/guru99home/");
	    
	    JavascriptExecutor jse  = ((JavascriptExecutor)driver);
	    jse.executeScript("window.scrollBy(0,1000)");
	    
	    //Dimension dim = new Dimension(480, 620);
	    //driver.manage().window().setSize(dim);
	    
	    File src  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    FileUtils.copyFile(src, new File (""));
	    
	    
	    
	    
	    
	}

}
