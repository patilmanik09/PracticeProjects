package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleRadioButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mpatil\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=65jpff8404u16b7p8h545jbp84");
	    driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).isDisplayed();
	    driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).isEnabled();
	    driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).isSelected();
	    driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
	    
	    //or 
	    
	    WebElement maleRadioButton = driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
	    boolean elementStatus = maleRadioButton.isDisplayed();
	    System.out.println(elementStatus);
	    System.out.println(maleRadioButton.isEnabled());
	    System.out.println(maleRadioButton.isSelected());
	    maleRadioButton.click();
	    
	    
        
	}

}
