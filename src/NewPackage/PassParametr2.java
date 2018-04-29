package NewPackage;

public class PassParametr2 {
	
	public int add (int a , int b) {
		
		int c= a+b;
		
		return c;
	}
		public double sub(double x , double y) {
			
			double result= x-y;
			
			return result;
		
	}
	public static void main(String[] args) {
	
		PassParametr2 obj = new PassParametr2();
		
		int sum = obj.add(10, 20);
		System.out.println("addition of " +sum);
		
		double sub = obj.sub(20.45, 10.44);
		System.out.println("substraction of " +sub);
		
		String fullname = PassParametr.getmyFullname("manik", "patil");
		
		System.out.println("full name: "+fullname);
		
	}

}
