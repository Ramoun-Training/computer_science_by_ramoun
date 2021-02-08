package NEW;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.InputMismatchException;

public class codeConverter {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		File file = new File("txt.txt");
		File newFile = new File("codded one.txt");
		Scanner scanner = new Scanner(file);
		FileWriter writer = new FileWriter(newFile,true);
		int c = 1;
		
		if (!file.exists()) {
			System.out.println("File not found.");
		}
		
		try {
			do {
				String line = scanner.nextLine();
				if (c != 1) {
					writer.write("+ ");
				}
				writer.write("\"" + line + "\\n" + "\"" + "\n");
				c++;
			} while (scanner.hasNext());
		}
		catch (InputMismatchException e) {
			System.out.println("How come man.");
			System.out.println("*info: ");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("An Exception occurred: ");
			System.out.println("*Info about it:");
			System.out.println("name: " + e.toString());
			System.out.println("info: " + e.getMessage());
		} 
		finally {
			scanner.close();
			writer.close();
		}
		
	}
	
}
