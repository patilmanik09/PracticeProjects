package NewPackage;

public class PassParametr {
	
	public void add (int a , int b) {
		
		int c= a+b;
		
		System.out.println("addition " +c);
	}
		public void sub (int x , int y) {
			
			int result= x-y;
			
			System.out.println("addition " +result);
	}
		
		public static String getmyFullname (String firstname, String lastname) {
			
			String fullname = firstname+lastname;
			
			return fullname;
		}
	public static void main(String[] args) {
	
		PassParametr obj = new PassParametr();
		
		obj.add(10, 20);
		obj.sub(20, 10);

	}

}
