package java_Programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
	
	int sum=0, reminder, num;
	
	Scanner su = new Scanner(System.in);
	
	System.out.println("Enter the number");
	
	num = su.nextInt();
	
	while(num!=0) {
	 
	reminder = num%10;
	sum= sum+reminder;
	num= num/10;
	}
	
	System.out.println("The sum of digits is " +sum);
	
	}

}
