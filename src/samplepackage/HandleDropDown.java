package samplepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=ogg93jt0dr03sg4c5sbgpvdrf7");
	    Select DropDown = new Select(driver.findElement(By.name("country")));
	    //DropDown.selectByVisibleText("Angola");
	    DropDown.selectByIndex(1);
	    
	    List<WebElement> e = DropDown.getOptions();
	    int itemsCount = e.size();
	    System.out.println(itemsCount);
	  
        
	}

}
