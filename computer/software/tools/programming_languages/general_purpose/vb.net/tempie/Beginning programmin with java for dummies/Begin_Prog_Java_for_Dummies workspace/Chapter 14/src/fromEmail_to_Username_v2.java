import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class fromEmail_to_Username_v2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileReader = new Scanner(new File("e-mail.dat"));
		PrintStream fileWriter = new PrintStream("name.dat");
		char symbol;

		while (fileReader.hasNext()) {
			symbol = fileReader.findWithinHorizon(".", 0).charAt(0);
			while (symbol != '@') {
				fileWriter.print(symbol);
				symbol = fileReader.findWithinHorizon(".",0).charAt(0);
			}
			fileReader.next();
			fileWriter.println();
		}

		fileReader.close();
		fileWriter.close();
	}

}
