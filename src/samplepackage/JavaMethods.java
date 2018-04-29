package samplepackage;

public class JavaMethods {
	//With returning a value method
	public static void studentmarks(int marks) {
		
		if (marks>=600) {
			
			System.out.println("Rank A");
		}
	 else if (marks>=500){
			System.out.println("Rank B");
	}
	 else 
	 {
		 System.out.println("Rank C");
		
	}
	}
	public static void main(String[] args) {
		
		studentmarks(600);
		
			

	}

}
