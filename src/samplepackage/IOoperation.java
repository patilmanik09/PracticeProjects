package samplepackage;

import java.util.Scanner;

public class IOoperation {

		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scan.nextLine();
		System.out.println("your name is "+name);
		
		System.out.println("Enter your city");
		String city = scan.next();
		System.out.println("your city is" +city);
		
		System.out.println("Enter a integer number ");
		int num = scan.nextInt();
		System.out.println("your int number is" +num);
		
		System.out.println("Enter a long number ");
		long num1 = scan.nextLong();
		System.out.println("your long number is" +num1);
		
		System.out.println("Enter a char ");
		char A = scan.next().charAt(0);
		System.out.println("your char  is" +A);
		

	}

}
