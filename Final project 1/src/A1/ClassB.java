package A1;

import java.io.FileWriter;
import java.io.IOException;

public class ClassB {
	

	public static void main(String[] args) {
		
		String data = "111, M Abdulaiz, Simplilearn , kishore , SDA , final1";
		
		try {
			
			FileWriter output = new FileWriter("file.txt");
			output.write(data);
			System.out.println("data is written successfully");
			output.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("file write error");
			
		}
				
		
}
	}
