package InterfacePackage;

public class DemoClass {

	public static void main(String[] args) {
	
		SuperClass obj = new SuperClass();
		obj.sample();
		obj = new SubClass();
        obj.sample();

	}

}
