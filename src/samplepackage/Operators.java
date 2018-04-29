package samplepackage;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=5, c=15;
		String d= "selenium", e= "Testing";
		
		System.out.print("addition of a,b is:"+(a+b));
		System.out.print("addition of a,b is:"+(a-b));
		System.out.print("addition of a,b is:"+(a*b));
		System.out.print("addition of a,b is:"+(a/b));
		System.out.print("addition of a,b is:"+(a%b));
		
			
		//Relational operators
		System.out.print((a>b));
		System.out.print((a>=b));
		System.out.print((a==b));
		System.out.print((a<b));
		System.out.print((a<=b));
		System.out.print((a!=b));
		
		boolean i= true, j=false;
		
		System.out.println(!(i && j));
		System.out.println((i && j));
		System.out.println((i || j));
		
		if ((a>b) && (a>c)) {
			
			System.out.print("A is big number");
			
		}
			else {
				System.out.print("B is a big number");
		}
		
		
		
		
		
		
			}

}
