package NewPackage;

public class class2 {

	public static void main(String[] args) {
		
		String browser= "chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
		
		System.out.println("Execute TC in chrome");
		}
		
		else if (browser.equalsIgnoreCase("firefox")){
			
			System.out.println("Execute TC in firefox");
		}
	    
		else if (browser.equalsIgnoreCase("IE")) {
			
			System.out.println("Execute TC in IE");
		}
		else {
			
			System.out.println("Provide valid browser");
		}
	}   


}
