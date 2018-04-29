package NewPackage;

public class ClassNew2 {
	
	public void myMethod() {
		
		System.out.println("UFT");
	}

	public static void main(String[] args) {
		ClassNew2 obj1 = new ClassNew2();
		obj1.myMethod();
		
		ClassNew1 obj2 = new ClassNew1();
		obj2.myMethod();
		
	}

}
