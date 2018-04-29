package samplepackage;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=2;
		
		int abc [] = new int [4];
		
		try {
			int result = a/b;
			System.out.println(result);
			} 
		    
		catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
		System.out.println(" Hello selenium");
		
		try
		{
		abc [30] = 20;
		System.out.println(abc[3]);
		}
		catch (ArrayIndexOutOfBoundsException c){
			System.out.println("Array index out of bonds exception");
		}
	
		System.out.println(" Hello java");
	}

}
