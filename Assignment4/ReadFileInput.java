package Assignment4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInput {

	public static void main(String[] args) throws IOException {

		FileReader inputFile = null;
		
		int character;
		
		try {
			inputFile = new FileReader("./src/Assignment4/quote.txt");
			
			while((character = inputFile.read()) != -1) {
				System.out.print((char)character);
			}
		}
		finally {
			if(inputFile != null)
				inputFile.close();
		}
	}

}
