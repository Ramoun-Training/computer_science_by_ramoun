import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class too {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file_reader = new Scanner(new File("C:\\Users\\Ramoun\\Desktop\\this.txt"));
		PrintStream file_printer = new PrintStream("C:\\Users\\Ramoun\\Desktop\\gak.txt");

		while (file_reader.hasNext()) {
			char f_char = file_reader.findWithinHorizon(".", 0).charAt(0);
			while (f_char != '@') {
				file_printer.print(f_char);
				f_char = file_reader.findWithinHorizon(".", 0).charAt(0);
			}
			file_reader.nextLine();
			file_printer.println();
		}
		
		System.out.println("Printed Successfully.");
		
		file_reader.close();
		file_printer.close();
	}

}
