package samplepackage;

public class ClassA {
 int a=10, b=20;
 public void add(){
 System.out.println(a+b);
 }
 
 public void multiply() {
	 System.out.println(a*b);
 }
	public static void main(String[] args) {
   ClassA objA = new ClassA();
   objA.add();
   objA.multiply();

	}

}
