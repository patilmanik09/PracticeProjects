package NewPackage;

public class HeroHonda extends Bike{
	
	@Override
	public void engine() {
	System.out.println("Bike has engine");
		
	}

	@Override
	public void handle() {
	System.out.println("Bikes has handle");
	}
	
	public static void main(String[] args) {
		
	HeroHonda obj1 = new HeroHonda();
	obj1.seat();
	obj1.wheels();
	obj1.engine();
	obj1.handle();
			
	}

}
