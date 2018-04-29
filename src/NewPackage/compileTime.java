package NewPackage;

public class compileTime {
	
public void add(int a, int b) {
		int c=a+b;
		System.out.println("sum of a and b is "+c);
}

public void add(int a, int b, int c) {
	int sum=a+b+c;
	System.out.println("sum of a and b is "+sum);
}

public void add(double a, double b) {
	double sum=a+b;
	System.out.println("sum of a and b is "+sum);
}

public void add(int a, double b) {
	double sum=a+b;
	System.out.println("sum of a and b is "+sum);
}

public void add(double a, int b) {
	double sum=a+b;
	System.out.println("sum of a and b is "+sum);
}

	public static void main(String[] args) {
		
		compileTime obj = new compileTime();
		obj.add(1, 2);
		obj.add(1, 2, 3);
		obj.add(1.1, 1.2);
		obj.add(1,10.1);
		obj.add(10.1, 1);
		
	}

}
