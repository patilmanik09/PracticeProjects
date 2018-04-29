package samplepackage;

public class ClassB extends ClassA{
int a=100, b=200;
public void add() {
System.out.println(a+b);
}
	public static void main(String[] args) {
	
	ClassB objB = new ClassB();
	objB.add();
	System.out.println(objB.a);
	objB.multiply();
    System.out.println(objB.b);
    
	}

}
