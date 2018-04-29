package Constructor;

public class Thiskeyword1 {
	
	int x;
	int y;
	int z;
	
	public Thiskeyword1(int x, int t, int z) {
		
	x=x;
	y=t;
	this.z=z;
	}
	
	public static void main(String[] args) {
		
	Thiskeyword1 obj = new Thiskeyword1(10,20,30);
	
	System.out.println("The value of x is "+obj.x);
	System.out.println("The value of x is "+obj.y);
	System.out.println("The value of x is "+obj.z);
	

	}

}
