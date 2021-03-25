package Oldies_io;
import java.util.Scanner;

public class toUpperCase {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		String input;
		
		System.out.print("Enter your text <in lower case>: ");
		input = keys.nextLine();
		
		System.out.println(input.toUpperCase());
		
		keys.close();
	}

}
