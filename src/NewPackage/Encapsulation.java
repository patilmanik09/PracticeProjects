package NewPackage;

public class Encapsulation {
	
	private String name= "Test Automation";
	
	public String getname() {
	return name;

	}
	public static void main(String[] args) {
	
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getname());
		

	}

}
