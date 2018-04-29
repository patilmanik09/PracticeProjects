package Constructor;

public class ThisKeyword {
	
	int a;
	int b;
	int c;
	
	public void add(int a, int b) {
		
		this.a=a;
		this.b=b;
		
	}
	
	public void sub() {
		
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
	}
	
	public static void main (String[] args) {
		ThisKeyword obj = new ThisKeyword();
		obj.add(10, 20);
		System.out.println(obj.b);
		obj.sub();
		

}
}
