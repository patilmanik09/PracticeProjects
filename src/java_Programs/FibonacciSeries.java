package java_Programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	
	int num;
	int t1=0, t2=1;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num");
	
	num = sc.nextInt();
	
	for (int i=1; i<=num; i++) {
		
	System.out.println(t1+ "");
	
	int sum = t1+t2;
	t1=t2;
	t2=sum;
	
	}

	}

}
