package samplepackage;

public class Variables {

	//Static variable 
	static int a=100;

	//Local variable 
	public int salary() {
		int mysalary = 1000+200+1000;
		return mysalary;
	}
	public static void main (String [] args){
		
		int b=200;
		System.out.println(a);
		System.out.println(b);
		
	Variables obj = new Variables();
	int x= obj.salary();
	System.out.print(x);
	
	for (int i=1; i<=5; i++) {
	
	System.out.print(i);
	
	}
		

	}

}
