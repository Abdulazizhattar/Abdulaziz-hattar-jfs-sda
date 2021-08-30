package A1;

import java.io.File;

public class ClassE {
	public static void main(String[] args) {
		
		File myFile = new File("file.txt");
		
		if (myFile.delete()) {
			System.out.println("file deleted: "+myFile.getName()+ " successfully");
		}
		else {
			System.out.println("failed to delete a file");
			
		}
	}

}
