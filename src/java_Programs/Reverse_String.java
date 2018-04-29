package java_Programs;

import java.util.Scanner;

public class Reverse_String {
	
	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	System.out.println("Enter your name");
	String name = read.nextLine();
		
	String reverse = "";
    
	for (int i=name.length()-1; i>=0; i--) {

	reverse = reverse+name.charAt(i);
	}
    
	System.out.println(reverse);
			
	}
}
