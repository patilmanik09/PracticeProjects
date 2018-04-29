package NewPackage;

public class String_Split {

	public static void main(String[] args) {
		
		String name = "Selenium";
				String trim = "Selenium Testing";
		
		String fullname = "Selenium-Hp-UFT-LR";
				
		String [] stringarray = fullname.split("-");
		
       for (int i=0; i<stringarray.length; i++) {
    	   
    	   System.out.println(stringarray[i]);
    	   
       }
       
       System.out.println(name.charAt(4));
       
       System.out.println(trim.trim());
       
       System.out.println(name.equalsIgnoreCase(trim));
       
       
	}

}
