package samplepackage;

import org.openqa.selenium.By;

public class AdminLogin_ExtendKeyword extends Admin_login_Using_UserDefunedMethod {

	public static void main(String[] args) {
	
		AdminLogin_ExtendKeyword object = new AdminLogin_ExtendKeyword();
		object.launchBrowser();
		object.adminlogin("admin", "admin@123");
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();
		
		if (url.equals("http://www.gcrit.com/build3/admin")){
			
			System.out.println("Online Catalog - interface");
		}
			else {
				
				System.out.println("Online Catalog  - Interface failed");
			}
	driver.close();
	}

}
