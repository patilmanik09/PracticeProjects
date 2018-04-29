package samplepackage;

import org.openqa.selenium.By;

public class TC_multiple_admin extends Admin_login_Using_UserDefunedMethod{
	
	public static void main(String[] args) {
		
//redirecting to admin interface
		TC_multiple_admin obj3 = new TC_multiple_admin();
		obj3.launchBrowser();
		obj3.adminlogin("admin", "admin@123");
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();
		
		if (url.contains("http://www.gcrit.com/build3/")){
			
			System.out.println("Online Catalog - interface");
		}
			else {
				
				System.out.println("Online Catalog  - Interface failed");
			}
	driver.close();
		
// Valid user name and password
	obj3.launchBrowser();
	obj3.adminlogin("admin", "password");
	String url1 = driver.getCurrentUrl();
	
	if (url1.contains("http://www.gcrit.com/build3/admin")) {
		
		System.out.println("Admin login successfull");
	}
	
	else {
		
		System.out.println("Login Failed");
	}
	driver.close();
		
//Invalid username and password
	obj3.launchBrowser();
	obj3.adminlogin("admin", "admin123");
	String errormessage = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td")).getText();

	if (errormessage.contains("Error: Invalid administrator login attempt.")) {
		
		System.out.println("Admin login unsuccessfull");
	}
	
	else {
		
		System.out.println("admin Login successfull");
	}
	driver.close();
		

}
}