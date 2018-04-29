package Constructor;

abstract class manik{
	
	int z=10;
	
	abstract public int add(int x, int v);
	abstract public int sub(int x, int y);
	
}

public class AbstractClass extends manik{

	public static void main(String[] args) {
		AbstractClass obj = new AbstractClass();
		System.out.println("Sum of x and y is "+obj.add(10, 20));
		System.out.println("Sum of x and y is "+obj.sub(20, 10));

	}

	@Override
	public int add(int x, int y) {
		
		return (x+y);
	}

	@Override
	public int sub(int x, int y) {
		
	return (x-y);
		
	}


}
