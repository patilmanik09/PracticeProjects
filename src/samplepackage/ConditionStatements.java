package samplepackage;

public class ConditionStatements {

	public static void main(String[] args) {
		int a= 50;
		
		if ((a>=1)  && (a<=100)) {
			
			System.out.print("A is a small number");
		}
		else if ((a>=100) && (a<=1000)) {
			
			System.out.print("A is a medium number");
		}
			
			else if (a>=10000) {
				
				System.out.print("A is a high number");
			}
			else {
				System.out.print(" A is a negative or positive number");
		
		}
	}

}
