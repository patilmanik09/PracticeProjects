package samplepackage;

public class ArrayClass {

	public static void main(String[] args) {
	
		//1st method
		
		int a [];
		a= new int [4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		System.out.println(a[0]+a[2]);
		
//2nd method
		
		int [] abc = new int [3];
		
		abc [0]=10;
		abc [1]=20;
		abc [2]=30;
		
		System.out.println(abc[1]+abc[2]);
		
		//3rd method
		
		int [] pqr = {10,20,30};
		
		System.out.println(pqr[2]);
		
		char [] array1 = {'A', 'B', 'C'};
		int [] array2 = {10,20,30,40};
		String [] array3 = {"selenium","qtp", "Jmter", "LR"};
		boolean [] array4 = {true, false, false, true};
		
		System.out.println(array1[1]);
		System.out.println(array2[3]);
		System.out.println(array3[2]);
		System.out.println(array4[0]);
		
		//copy from one array to another array
		
		int [] array5 = {11,12,13,14};
		
		int array6 []= array5;
		System.out.println(array6[2]);
		
		for (int i=0; i<array6.length; i++) {
			System.out.println(array6[i]);
		}
		
	}

}
