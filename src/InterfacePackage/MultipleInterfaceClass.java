package InterfacePackage;

public class MultipleInterfaceClass implements InterfaceClass, InterfaceClass2, InterfaceClass3{

	@Override
	public void multiplication(int a, int b) {
		
		System.out.println("multiplication is "+(a*b));
		
	}

	@Override
	public void substraction(int a, int b) {

		System.out.println("multiplication is "+(a-b));
		
	}

	@Override
	public void add(int param1, int param2) {
		
		System.out.println("multiplication is "+(param1+param2));
	}

	@Override
	public void sub(int a, int b) {

		System.out.println("multiplication is "+(a-b));
	}

}
