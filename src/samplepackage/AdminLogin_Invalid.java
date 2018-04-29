package samplepackage;

import org.openqa.selenium.By;

public class AdminLogin_Invalid extends Admin_login_Using_UserDefunedMethod {

	public static void main(String[] args) {
		
			AdminLogin_Invalid obj2 = new AdminLogin_Invalid();
			obj2.launchBrowser();
			obj2.adminlogin("admin", "admin123");
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
