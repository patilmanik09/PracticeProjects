package java_Programs;

import java.util.Scanner;

public class Reverse_Integer {

	public static void main(String[] args) {
	
	int Num=0;
	int Reverse=0, Reminder;
	
	System.out.println("Enter the number:");
	
	Scanner data = new Scanner(System.in);
	
	Num = data.nextInt();
    
	while (Num>0)
	{
		Reminder = Num %10;
		Reverse = Reverse * 10 + Reminder;
		Num = Num /10;
	}

	System.out.println("Reverse number is " + Reverse);
}
}