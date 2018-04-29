package java_Programs;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		int sum=0;
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			sum = sum+i;
			
		}
		
		System.out.println("Sum of number is "+sum);
		
		

	}

}
