package NewPackage;

public abstract class Bike {
	
	public void seat() {
		System.out.println("Bikes has seat");
	}
	
    public void wheels() {
	System.out.println("Bikes has wheels");
    }
    
    public abstract void engine();
    
    public abstract void handle();
    

public static void main (String[] args) {
	
	HeroHonda obj1 = new HeroHonda();
	obj1.seat();
	obj1.wheels();
	obj1.engine();
	obj1.handle();
	
}
}