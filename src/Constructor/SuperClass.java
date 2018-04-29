package Constructor;

class Parent1 {
	
	int x=20;
}

public class SuperClass extends Parent1 {
	
	int x=10;
	
	public void add() {
		
		System.out.println("The value of x is " +super.x);
		System.out.println("The value of x is " +x);
	}

	public static void main(String[] args) {
	
		SuperClass obj = new SuperClass();
		obj.add();

	}

}
