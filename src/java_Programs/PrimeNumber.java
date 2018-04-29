package java_Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int num, i, count=0;
		
		Scanner PN= new Scanner (System.in);
		
		System.out.println("Enter number");
		
		num=PN.nextInt();
		
		for (i=2; i<=num; i++) {
		
		if (num%i==0) {
			
			count++;
			break;
		}
		}
		
		if (count==0) {
			System.out.println("This is prime number");
		}
		else {
			
			System.out.println("This is not prime number");
		}
		
		
	}

}
