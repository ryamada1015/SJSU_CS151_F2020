package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntToHex {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String hex;
		int input;
		
		try {
			while(true) {
				System.out.print("Enter an integer: ");
				
				input = scanner.nextInt();
				hex = Integer.toHexString(input);
				System.out.println("Hexadecimal of the entered value is: " + hex);
				
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Enter an integer.");
		}
		
	}

}
