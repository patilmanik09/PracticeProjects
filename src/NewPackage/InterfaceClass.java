package NewPackage;

public class InterfaceClass implements Interface1{

	@Override
	public void engine() {
		System.out.println("Bikes has engine");
		
	}

	@Override
	public void wheels() {
		System.out.println("Bikes has wheels");
		
	}

	@Override
	public void seat() {
		System.out.println("Bikes has seat");
		
	}

	@Override
	public void handle() {
		System.out.println("Bikes has handle");
		
	}
    
	public static void main(String[] args) {
		
		InterfaceClass obj = new InterfaceClass();
		obj.engine();
		obj.handle();
		obj.seat();
		obj.wheels();
    	
	
}
}
