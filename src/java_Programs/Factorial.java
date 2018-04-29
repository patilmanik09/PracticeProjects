package java_Programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
	long n;
	int fact=1;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number");
	
	n = sc.nextLong();
	
	sc.close();
	
	for (int i=1; i<=n; i++) {
	
	fact = fact*i;

	}
	System.out.println("factorial is "+fact);

	}
}
