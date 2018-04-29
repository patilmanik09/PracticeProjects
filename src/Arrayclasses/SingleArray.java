package Arrayclasses;

public class SingleArray {

	public static void main(String[] args) {
	
	int student_id [] = new int [5];
	student_id[0] = 10;
	student_id[1]= 20;
	student_id[2]= 30;
	student_id[3]= 40;
	student_id[4]= 50;
	
	int sizearray = student_id.length;
	System.out.println("array size " +sizearray);

 
	for (int i=0; i<sizearray; i++) {
		
		System.out.println("student_id " +student_id[1]);
	}
	
		

	}

}
