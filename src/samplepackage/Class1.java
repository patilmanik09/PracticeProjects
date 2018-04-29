package samplepackage;

public class Class1 {
	//declare static variables
	static int a=10, b=20;
	//declare non static variables
	int c=30, d=40;
	
	//Create static method with returning a value
	
	public static int add() {
		int result = a+b;
		return result;
	}
//create static method without returning value 
	
	public static void multiply() {
	System.out.println(a*b);
	}
	
	//Create non static method with returning a value
	
	public int add1() {
		int rest = a+b;
		return rest;
	}
	//Create non static method without returning a value
	
	public void multiply1() {
	System.out.println(a*b);
	}
	
	public static void main(String[] args) {
	
	//Access static class members by using class name
		
		int x= Class1.add();
		System.out.println(x);
		System.out.println(Class1.a);
		
        Class1.multiply();
        
    //Access non static class members
        
        Class1 obj1 = new Class1();
        int y = obj1.add1();   
        System.out.println(y);
        System.out.println(obj1.c);
        obj1.multiply1();
        
        
	}

}
