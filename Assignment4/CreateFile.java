package Assignment4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class CreateFile {
	
	
	public static void main(String[] args) throws IOException {
		
		String str ="";
		FileWriter file = null;
		
		try {
			file = new FileWriter("./src/Assignment4/command_line_input.txt");
			Scanner input = new Scanner(System.in);

			while(!str.contentEquals("@q")) {
				if(!str.contentEquals(""))
					file.write(str);
				System.out.print("Enter anything to write to a file (@q to exit): ");
				str = input.next();
			}
			System.out.println("User exited the program.");
		}
		finally {
			if(file != null)
				file.close();
		}
		
	
	}
		
}

