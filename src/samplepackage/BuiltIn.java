package samplepackage;

import java.util.Arrays;

public class BuiltIn {

	public static void main(String[] args) {
		String str1  = "selenium";
		String str2 = "SELENIUM";
		String str3 = "seleniuma";
		String [] array1 = {"selenium", "UFT", "LR", "Jmeter"};
	    boolean str = Arrays.asList(array1).contains("UFT");
		System.out.println(str); 
	    		
      }

}
