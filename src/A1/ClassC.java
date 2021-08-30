package A1;


import java.io.FileReader;
import java.io.IOException;

public class ClassC {
	public static void main(String[] args) {
	
		char[] data = new char[100];
		
		try {
			
			FileReader input = new FileReader ("file.txt");
			input.read(data);
			System.out.println("data received from a file");
			System.out.println(data);
			input.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("file read error");
		}
	}
}
