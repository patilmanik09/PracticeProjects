package NewPackage;

public class Class3 {
	
	int x=20;
	int y=30;
	
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println("sum of a and b is "+c);
		
	}

	public static void main(String[] args) {
	
		Class3 obj1 = new Class3();
		obj1.add();
		System.out.println(obj1.x);
		System.out.println(obj1.y);		
		
	}
	
}
