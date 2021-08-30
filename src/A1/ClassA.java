package A1;

import java.io.File;
import java.io.IOException;

public class ClassA {

	public static void main(String[] args) {
		
		File myFile = new File ("file.txt");
		 
		
		try {
			if (myFile.createNewFile() ) {

				System.out.println("File created successfully");
			}
				else {
					
					System.out.println("File creation wrong");
					
					
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File error");
		}
		
			}
			
	
		
	}
			
	

