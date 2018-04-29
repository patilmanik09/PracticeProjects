package samplepackage;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) {
		File fileobject = new File("C:/Users/Mpatil/Desktop/manik");
		//fileobject.mkdirs();
		//fileobject.delete();
			
		boolean a = fileobject.exists();
		
		if (a==true) {
			
			System.out.println("folder is exists");
		}
		
		else {
			
			System.out.println("Folder does not exists");
			
		}

	}

}
