package samplepackage;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
	
		File fileobject = new File("C:/Users/Mpatil/Desktop/UFT.xlsx");
		
		fileobject.createNewFile();
				
		

	}
}
