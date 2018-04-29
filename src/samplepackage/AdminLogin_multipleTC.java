package samplepackage;

public class AdminLogin_multipleTC extends Admin_login_Using_UserDefunedMethod {

	public static void main(String[] args) {
	
	AdminLogin_multipleTC obj1 = new AdminLogin_multipleTC();
	obj1.launchBrowser();
	obj1.adminlogin("admin", "password");
	String url = driver.getCurrentUrl();
	
	if (url.contains("http://www.gcrit.com/build3/admin")) {
		
		System.out.println("Admin login successfull");
	}
	
	else {
		
		System.out.println("Login Failed");
	}
	driver.close();
	
	
	}

}
