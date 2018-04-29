package java_Programs;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		int r;
		double pi = 3.14;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radius");
		r=sc.nextInt();
		
		area = pi*r*r;
		
		System.out.println("Area of circle is " +area);	

	}

}
