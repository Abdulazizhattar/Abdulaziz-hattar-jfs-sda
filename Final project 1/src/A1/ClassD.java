package A1;

import java.io.FileWriter;
import java.io.IOException;

public class ClassD {
	public static void main(String[] args) {
		
		String data = "this data is appended";
		
		try {
			
			FileWriter output = new FileWriter ("file.txt", true);
			output.write(data);
			System.out.println("data is appended successfully");
			output.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("file append error");
		}
	}
}
