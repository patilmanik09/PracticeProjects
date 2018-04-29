package samplepackage;

public class ClassC extends ClassB{
	
	int a= 1, b=2;
	public void add() {
	System.out.println(a+b);
	}

	public static void main(String[] args) {
		ClassC objC = new ClassC();
		objC.add();
		objC.multiply();
	System.out.println(objC.b);

	}

}
